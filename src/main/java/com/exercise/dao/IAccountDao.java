package com.exercise.dao;

public interface IAccountDao {

	void tranferIn(Integer id,Double amount);
	void tranferOut(Integer id,Double amount);
}
