package com.pxt.service.user;

import com.pxt.dao.user.UserDao;
import com.pxt.pojo.user.User;

public class UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.save(user);
	}
}
