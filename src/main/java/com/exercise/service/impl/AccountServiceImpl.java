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

	@Transactional//ע����������@Transactional����д�������ϣ�Ȼ���ڷ�����д��ע�������propagation������
	@Override
	public void transfer(Integer in, Integer out, Double amonut) {
		accountDao.tranferIn(in, amonut);
//		Integer.parseInt("ss");
		accountDao.tranferOut(out, amonut);
	}

}
