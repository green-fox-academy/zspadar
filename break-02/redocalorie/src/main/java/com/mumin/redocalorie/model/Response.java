package com.mumin.redocalorie.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 03..
 */
@Getter
@Setter
public class Response {
  private String status;

  public Response(String status) {
    this.status = status;
  }
}
