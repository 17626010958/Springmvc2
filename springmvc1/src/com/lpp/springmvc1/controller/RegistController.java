package com.lpp.springmvc1.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpp.springmvc1.pojo.User;

@Controller
public class RegistController {
	@GetMapping("/user")
	@ResponseBody
	public User selectUser() {
		User u = new User();
		u.setAge(23);
		u.setBirthday(new Date());
		u.setName("����");
		u.setPassword("19950713");
		u.setSalary(10000F);
		u.setUsername("������");
		//�ɶ�����Json��ʽ���ظ�ǰ̨
		return u;
	}
	@PostMapping("/register_user")
	@ResponseBody
	/*public String regist(String username, String password, String name, Integer age, Float salary) {
		return "success";
	}*/
	public String regist(User user) {
		return "suceess����ɹ�";
	}
	
	
	@GetMapping("/hi/{name}")
	@ResponseBody
	public String hello(@PathVariable("name") String n) {
		return "I'll be back --" + n;
	}
	
	
}
