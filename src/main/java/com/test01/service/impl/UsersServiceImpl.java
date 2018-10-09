package com.test01.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.test01.entity.Users;
import com.test01.mapper.UsersMapper;
import com.test01.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	private final static Map<String,Object> map = new HashMap<String,Object>();
	@Autowired
	private UsersMapper usersMapper;
	@Override
	public void insert(Users users) {
		usersMapper.insert(users);
		
	}
	@Override
	public Users queryUsers(User user) {
		map.clear();
		map.put("username", user.getUserName());
		map.put("password", user.getUserPwd());
		return usersMapper.selectByPrimaryKey(map);
	}

}
