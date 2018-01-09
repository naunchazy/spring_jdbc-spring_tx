package com.exercise.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exercise.dao.IAccountDao;

@Repository
public class AccountDaoImpl implements IAccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void tranferIn(Integer id, Double amount) {
		String sql="update account set amount=amount+? where accountId=?";
		jdbcTemplate.update(sql, amount,id);
		
	}

	@Override
	public void tranferOut(Integer id, Double amount) {
		String sql="update account set amount=amount-? where accountId=?";
		jdbcTemplate.update(sql, amount,id);
	}

	
}
