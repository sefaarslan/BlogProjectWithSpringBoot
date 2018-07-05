package com.sefaarslan.dao.mem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.sefaarslan.dao.UserRepository;
import com.sefaarslan.model.User;

@Repository
public class UserRepositoryInMemoryImpl implements UserRepository {
	
	private Map<Long, User> usersMap = new HashMap<>();
	
	public UserRepositoryInMemoryImpl() {
		User user1 = new User();
		user1.setId(1L);
		user1.setFirstName("SEFA");
		user1.setLastName("ARSLAN");

		User user2 = new User();
		user2.setId(2L);
		user2.setFirstName("Muammer");
		user2.setLastName("Yücel");

		User user3 = new User();
		user3.setId(3L);
		user3.setFirstName("Hümeyra");
		user3.setLastName("Arslan");
		
		

		usersMap.put(user1.getId(), user1);
		usersMap.put(user2.getId(), user2);
		usersMap.put(user3.getId(), user3);
	}

	

	@Override
	public List<User> findByLastName(String lastName) {
		return usersMap.values().stream()
				.filter(o -> o.getLastName().equals(lastName))
				.collect(Collectors.toList());
	}

	

	@Override
	public void delete(Long id) {
		usersMap.remove(id);
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<>(usersMap.values());
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return usersMap.get(id);
	}

	@Override
	public void create(User user) {

		user.setId(new Date().getTime());
		usersMap.put(user.getId(), user);
	}

	@Override
	public User update(User user) {
		usersMap.replace(user.getId(), user);
		return user;		
	}

}
