package com.lpp.springmvc1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpp.springmvc1.mapper.AreaMapper;
import com.lpp.springmvc1.pojo.Area;

@Controller
public class AreaController {
	@Resource
	private AreaMapper areaMapper;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Area> findAll(){
		return areaMapper.findAll();
	}
}
