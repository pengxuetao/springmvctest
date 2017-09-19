package com.pxt.dao.user;

import org.springframework.stereotype.Repository;

import com.pxt.pojo.user.User;

@Repository
public class UserDao {
	public void save(User user) {
		System.out.println("saved user "+user.getUserid()+" name "+user.getUsername());
	}
}
