package com.jdbc.template;

import java.util.List;

public interface AccountDao {
	public int addAcount(Account account);
	public int updateAcount(Account account);
	public int deleteAccount(int id);
	public Account findAccountById(int id);
	public List<Account> findAllAccount();
	public void transfer(String outUser,String inUser,Double money);
}
