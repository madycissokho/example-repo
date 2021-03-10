package com.saraya.rest.services.firstMadyWebService.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 5;
	static {
		users.add(new User(1, "Mady", new Date()));
		users.add(new User(2, "Manding", new Date()));
		users.add(new User(3, "Leila", new Date()));
		users.add(new User(4, "Niang", new Date()));
		users.add(new User(5, "Drissa", new Date()));
	}
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}else {
			users.add(user);
			return user;
		}
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() ==id) {
				return user;
			}
		}
		return null;
	}
}
