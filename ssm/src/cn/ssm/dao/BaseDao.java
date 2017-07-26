package cn.ssm.dao;

import java.util.List;

//抽象泛型的即可
public abstract interface BaseDao<T> {
	//查询所有
	public List<T> findAll();
}
