package com.byc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.byc.dao.UserDao;
import com.byc.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private  UserDao userDao;
	
	
	public List<User> query() {
		List<User> list = userDao.queryModel();
		return list;
	}
	
}
