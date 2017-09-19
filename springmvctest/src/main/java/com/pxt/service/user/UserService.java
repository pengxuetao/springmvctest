package com.pxt.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pxt.dao.user.UserDao;
import com.pxt.pojo.user.User;

@Service("userService")
public class UserService {
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void addUser(User user) {
		userDao.save(user);
	}
}
