package com.greenfox.zspadar.reddit.controller;

import com.greenfox.zspadar.reddit.services.PostRepository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 05. 12..
 */
@RestController
public class PostController {
  private PostRepository postRepository;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }
}
