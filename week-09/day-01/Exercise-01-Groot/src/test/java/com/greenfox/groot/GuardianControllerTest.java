package com.greenfox.groot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zsuzsanna.padar on 2017. 05. 15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
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

}
