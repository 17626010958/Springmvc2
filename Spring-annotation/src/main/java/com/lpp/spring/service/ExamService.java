package com.lpp.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lpp.spring.dao.Dao;
import com.lpp.spring.dao.EmpDao;
@Service
public class ExamService {
	@Resource(name="empExDao")
	private Dao edao;
	
	public ExamService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this + ": ���ڴ���");
	}
	
	public void attendence() {
		System.out.println(this + "���ڷ���attendence����");
		edao.create();
	}
}
