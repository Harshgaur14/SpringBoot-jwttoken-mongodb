package com.pmu.pmu.services;

import java.util.List;

import com.pmu.pmu.models.User;


public interface UsersService {

	
public User getUserByUsername(String username);
	
	public User getUserByEmail(String email);
	
	public User saveUser(User user);
	
	public List<User> getUsersWithRoles(String role);
	
	public boolean isUsernameExists(String username);
	
	public boolean isEmailExists(String email);
	
	
}
