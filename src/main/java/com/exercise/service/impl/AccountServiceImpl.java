package com.exercise.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.IAccountDao;
import com.exercise.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	private IAccountDao accountDao;

	@Transactional//注解声明事务，@Transactional可以写在类名上，然后在方法上写该注解可配置propagation等属性
	@Override
	public void transfer(Integer in, Integer out, Double amonut) {
		accountDao.tranferIn(in, amonut);
//		Integer.parseInt("ss");
		accountDao.tranferOut(out, amonut);
	}

}
