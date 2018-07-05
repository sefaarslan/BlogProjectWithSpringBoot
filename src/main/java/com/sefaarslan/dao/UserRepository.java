package com.sefaarslan.dao;

import java.util.List;

import com.sefaarslan.model.User;

public interface UserRepository {
	List<User> findAll();
	User findById(Long id);
	List<User> findByLastName(String lastName);
	void create(User user);
	User update(User user);
	void delete(Long id);
}
