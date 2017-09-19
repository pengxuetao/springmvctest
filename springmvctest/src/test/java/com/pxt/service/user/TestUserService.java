package com.pxt.service.user;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pxt.pojo.user.User;

import junit.framework.TestCase;

public class TestUserService extends TestCase {
	
	public void testAddUser() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/bean.xml");
		UserService userService = (UserService)applicationContext.getBean("userService");
		User user = (User)applicationContext.getBean("user");
		userService.addUser(user);
	}

}
