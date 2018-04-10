package com.jdbc.template;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountDaoImpl implements AccountDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addAcount(Account account) {
		// TODO 自动生成的方法存根
		String sql ="insert into account(username,balance) value(?,?)";
		Object[] obj = new Object[] {
					account.getUsername(),
					account.getBalance()
		};

		int num = this.jdbcTemplate.update(sql,obj);
		return num;
	}

	@Override
	public int updateAcount(Account account) {
		// TODO 自动生成的方法存根
		String sql = "update account set username=?,balance=? where id = ?";
		Object[] params = new Object[]{
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
		
		int num = this.jdbcTemplate.update(sql, params);
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		// TODO 自动生成的方法存根
		String sql = "delete from account where id = ?";
		int num = this.jdbcTemplate.update(sql, id);
		return num;
	}

	@Override
	public Account findAccountById(int id) {
		// TODO 自动生成的方法存根
		String sql = "select * from account where id = ?";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,id);
	}

	@Override
	public List<Account> findAllAccount() {
		// TODO 自动生成的方法存根
		String sql = "select * from account";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}
