package com.lpp.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class TestController {
	@GetMapping("/h")
	//@PostMapping("/h")
	@ResponseBody
	public String hello() {
		return "��ã�hello,I'm comming!";
	}
}
