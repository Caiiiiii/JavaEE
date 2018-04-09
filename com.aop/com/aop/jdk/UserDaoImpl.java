package com.aop.jdk;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void addUser() {
		// TODO 自动生成的方法存根
		System.out.println("add User");
	}

	@Override
	public void deleteUser() {
		// TODO 自动生成的方法存根
		System.out.println("delete User");
	}

}
