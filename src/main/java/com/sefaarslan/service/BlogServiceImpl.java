package com.sefaarslan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sefaarslan.dao.UserRepository;
import com.sefaarslan.exception.UserNotFoundException;
import com.sefaarslan.model.User;

@Service
public class BlogServiceImpl implements BlogService {
	
	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@Override
	public void createUser(User user) {
		userRepository.create(user);
	}



	@Override
	public void updateUser(User user) {
		userRepository.update(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.delete(id);
		
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> findUsers(String lastName) {
		return userRepository.findByLastName(lastName);
	}

	@Override
	public User findUsers(Long id) throws UserNotFoundException {
		User user = userRepository.findById(id);
		if(user == null) {
			throw new UserNotFoundException("User not found with id :" + id);
		}
		return user;
	}

	
}
