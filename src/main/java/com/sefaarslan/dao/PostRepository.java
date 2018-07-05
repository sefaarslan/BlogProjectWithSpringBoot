package com.sefaarslan.dao;

import java.util.List;

import com.sefaarslan.model.Post;

public interface PostRepository {
	Post findById(Long id);
	List<Post> findByOwnerId(Long userId);
	void create(Post post);
	Post update(Post pet);
	void delete(Long id);
	void deleteByOwnerId(Long userId);
}
