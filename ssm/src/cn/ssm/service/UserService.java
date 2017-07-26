package cn.ssm.service;

import java.util.List;

import cn.ssm.pojo.User;

public interface UserService {
	//查询所有
	public List<User> findAll();
}