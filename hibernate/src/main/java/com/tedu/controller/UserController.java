package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.Service.UserService;
import com.tedu.pojo.User;
@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return "hello";
	}
	@RequestMapping("fall")
	@ResponseBody
	public List<User> finadAll() {
		
		return userService.findAll();
	}
}
