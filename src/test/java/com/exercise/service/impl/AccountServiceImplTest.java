package com.exercise.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exercise.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springjdbc_tx.xml")
public class AccountServiceImplTest {

	@Autowired
	private IAccountService accountservice;
	@Test
	public void transferTest(){
		accountservice.transfer(1, 2, 100.0);
	}
}
