package com.lpp.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao implements Dao{
	
	public EmpDao() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this + ": ���ڴ���");
	}

	public void create() {
		System.out.println(this + ":ִ��create()");
	}
}
