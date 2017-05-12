package com.greenfox.zspadar.reddit.services;

import com.greenfox.zspadar.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zsuzsanna.padar on 2017. 05. 12..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
