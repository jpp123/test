package com.tedu.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.Service.StudentService;
import com.tedu.Service.UserService;
import com.tedu.pojo.Student;
import com.tedu.pojo.User;
@Controller
@RequestMapping("/")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("falls")
	@ResponseBody
	public List<Student> finadAll() {
		
		return studentService.findAll();
	}
	@RequestMapping("fallByName")
	@ResponseBody
	public List<Student> finadByName(@PathParam("name") String name) {
		
		return studentService.findByNmae(name);
	}
	@RequestMapping("fallBySex")
	@ResponseBody
	public List<Student> finadBySex(@PathParam("sex") String sex) {
		
		return studentService.findBySex(sex);
	}
	@RequestMapping("fallByAddress")
	@ResponseBody
	public List<Student> finadByAddress(@PathParam("address") String address) {
		
		return studentService.findByAddress(address);
	}
	@RequestMapping("updateName")
	@ResponseBody
	public String updateNmaeById(@PathParam("name") String name,@PathParam("id") Long id) {
		
		try {
			studentService.updateNmaeById(name,id);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "NO";
		}
		
	}
}
