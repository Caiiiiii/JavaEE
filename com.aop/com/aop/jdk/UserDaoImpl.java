package com.aop.jdk;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void addUser() {
		// TODO �Զ����ɵķ������
		System.out.println("add User");
	}

	@Override
	public void deleteUser() {
		// TODO �Զ����ɵķ������
		System.out.println("delete User");
	}

}
