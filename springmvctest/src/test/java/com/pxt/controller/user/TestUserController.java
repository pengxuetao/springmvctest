package com.pxt.controller.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pxt.pojo.user.User;
import com.pxt.service.user.UserService;

import junit.framework.TestCase;

public class TestUserController extends TestCase {

	private UserService userService;
	private ApplicationContext applicationContext;
	
	public void testAdd() {
		applicationContext = new ClassPathXmlApplicationContext("conf/bean.xml");
		userService = (UserService)applicationContext.getBean("userService");
		User user = (User)applicationContext.getBean("user");
		userService.addUser(user);
		
	}

}
