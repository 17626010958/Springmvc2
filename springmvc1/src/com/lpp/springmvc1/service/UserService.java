package com.lpp.springmvc1.service;

import org.springframework.stereotype.Service;

import com.lpp.springmvc1.pojo.User;
@Service
public class UserService {
	public User selectByName(String name) {
		if (name.equals("admin")) {
			User u = new User();
			u.setName("¶­Íñ·¼");
			return u;
		} else {
			return null;
		}
	}
}
