package com.green.g.repository;

import java.util.List;

import com.green.g.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
