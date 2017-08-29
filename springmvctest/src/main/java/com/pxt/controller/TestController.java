package com.pxt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController 
{
	@RequestMapping(value="/index")
	@ResponseBody
	public String hello(@RequestParam(value="id")String id, Model model, HttpSession httpSession)
	{	
		System.out.println("hello controller");
		System.out.println("id= "+id);
		model.addAttribute("msg", id);
		return id;
	}
	

}
