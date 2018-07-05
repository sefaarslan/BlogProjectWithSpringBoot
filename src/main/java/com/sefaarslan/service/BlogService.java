package com.sefaarslan.service;

import java.util.List;

import com.sefaarslan.exception.UserNotFoundException;
import com.sefaarslan.model.User;


public interface BlogService {
	List<User> findUsers();
	List<User> findUsers(String lastName);
	User findUsers(Long id) throws UserNotFoundException;
	void createUser(User user);
	void updateUser(User user);
	void deleteUser(Long id);
}
