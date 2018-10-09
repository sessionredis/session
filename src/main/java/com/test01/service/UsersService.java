package com.test01.service;

import java.util.List;

import com.entity.User;
import com.test01.entity.Users;

public interface UsersService {

	public void insert(Users users);
	public Users queryUsers(User user);
}
