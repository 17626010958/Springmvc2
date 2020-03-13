package com.lpp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lpp.spring.dao.EmpDao;
import com.lpp.spring.service.EmpService;
import com.lpp.spring.service.ExamService;
 
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ��spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("spring IOC ������ʼ���ɹ�");
		//
		//ע���bean��ID��Ĭ�������Ϊ��������ĸСд
		
		EmpService empservice = (EmpService)ctx.getBean("empService");
		empservice.entry();
		 
		 
		ExamService examservice = (ExamService)ctx.getBean("examService");
		examservice.attendence();
		
	}

}
