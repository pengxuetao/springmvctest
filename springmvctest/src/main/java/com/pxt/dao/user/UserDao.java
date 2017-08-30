package com.pxt.dao.user;

import com.pxt.pojo.user.User;

public class UserDao {
	public void save(User user) {
		System.out.println("saved user "+user.getUserid()+" name "+user.getUsername());
	}
}
