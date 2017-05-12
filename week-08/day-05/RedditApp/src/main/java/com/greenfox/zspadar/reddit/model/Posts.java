package com.greenfox.zspadar.reddit.model;

import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 05. 12..
 */
public class Posts {
  Iterable<Post> posts;

  public Posts() {
  }

  public Posts(Iterable<Post> posts) {
    this.posts = posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }

  public Iterable<Post> getPosts() {
    return posts;
  }
}
