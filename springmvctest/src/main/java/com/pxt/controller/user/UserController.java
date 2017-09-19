package com.pxt.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pxt.pojo.user.User;
import com.pxt.service.user.UserService;

@Controller
public class UserController 
{	
	@Resource(name="userService")
	private UserService userService;
	
	private ApplicationContext applicationContext;
	
	@RequestMapping(value="/add")
	@ResponseBody
	public String add(@RequestParam(value="id")String id, @RequestParam(value="name")String name, HttpSession httpSession)
	{	
		applicationContext = new ClassPathXmlApplicationContext("conf/bean.xml");
		userService = (UserService)applicationContext.getBean("userService");
		User user = (User)applicationContext.getBean("user");
		userService.addUser(user);
		return "success add "+user.getUserid();
	}
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/bean.xml");
		UserService userService = (UserService)applicationContext.getBean("userService");
		User user = (User)applicationContext.getBean("user");
		userService.addUser(user);
	}
	
}
