package com.JWTExample.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.JWTExample.entities.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Atul", "atul@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Kizzy", "kizzy@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "lappy", "lappy@gmail.com"));

	}

	public List<User> getUser() {
		return this.store;
	}
}
