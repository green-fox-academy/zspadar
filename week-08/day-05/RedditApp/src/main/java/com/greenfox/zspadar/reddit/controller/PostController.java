package com.greenfox.zspadar.reddit.controller;


import com.greenfox.zspadar.reddit.model.Post;
import com.greenfox.zspadar.reddit.model.Posts;
import com.greenfox.zspadar.reddit.services.PostRepository;

import java.util.Iterator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

  @GetMapping(value = "/posts")
  public Posts getPosts() {
    Posts posts = new Posts();
    Iterable<Post> repoPosts = postRepository.findAll();
    posts.setPosts(repoPosts);
    return posts;
  }

//  @PostMapping("/posts")
//  public Posts getPosts(@RequestBody Post post) {
//    Posts posts = new Posts();
//    postRepository.save(post);
//    Iterable<Post> repoPosts = postRepository.findAll();
//    posts.setPosts(repoPosts);
//    return posts;
//  }

  @PostMapping(value = "/posts")
  public Post postPosts(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @PutMapping(value = "posts/{id}/upvote")
  public Post upVotePosts(@PathVariable("id") long id) {
    Post post = postRepository.findOne(id);
    post.upVote();
    postRepository.save(post);
    return post;
  }
  @PutMapping(value = "posts/{id}/downvote")
  public Post downVotePosts(@PathVariable("id") long id) {
    Post post = postRepository.findOne(id);
    post.downVote();
    postRepository.save(post);
    return post;
  }





}
