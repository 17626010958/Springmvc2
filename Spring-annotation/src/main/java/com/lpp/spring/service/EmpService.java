package com.lpp.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lpp.spring.dao.Dao;


@Service
public class EmpService {
	// �Զ�����ǰ�����еĶ������ע�룬������get��set
	/**
	 * Ĭ��Resourceʹ����������Ϊbean ID����ע�� ����ָ��name�����ԣ���name���м���
	 */
	@Resource(name="empDao")
	private Dao empdao;// �������

	/*public Dao getEmpdao() {
		return empdao;
	}

	public void setEmpdao(Dao empdao) {
		this.empdao = empdao;
	}
*/
	public EmpService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this + ": ���ڴ���");
	}

	public void entry() {
		System.out.println("��ְ������entry()" + empdao);
		empdao.create();
	}
}
