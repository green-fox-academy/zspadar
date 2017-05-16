package com.greenfox.groot;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


import com.greenfox.guardian.GuardianApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void statusIsOKGroot() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value("somemessage"));
  }

  @Test
  public void statusIsNotOkGroot() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void statusIsOkYondu() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.0)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void statusIsNotOkYondu() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("I am Yondu!")));
  }

  @Test
  public void testCargoStatusIsEmptyRora() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)))
        .andExpect(status().isOk());
  }

  @Test
  public void testShipIsLoadedRora() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.30&amount=5000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus", is ("40%")))
        .andExpect(jsonPath("$.ready", is (false)));
  }

  @Test
  public void testWithOutParameterRora() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Missing parameter.")));
  }

  @Test
  public void testShipIsFullRora() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.30&amount=12500"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)));
  }

}
