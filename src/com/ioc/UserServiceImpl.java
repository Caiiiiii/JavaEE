package com.ioc;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserdao(UserDao userdao) {
		this.userDao = userdao;
	}
	@Override
	public void say() {
		// TODO 自动生成的方法存根
		this.userDao.say();
		System.out.print("userService say hello world");
	}

}
