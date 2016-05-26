package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserMapper;
import com.model.User;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(String id){
		return userMapper.getUserById(id);
	}
}
