package com.ioc;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserdao(UserDao userdao) {
		this.userDao = userdao;
	}
	@Override
	public void say() {
		// TODO �Զ����ɵķ������
		this.userDao.say();
		System.out.print("userService say hello world");
	}

}
