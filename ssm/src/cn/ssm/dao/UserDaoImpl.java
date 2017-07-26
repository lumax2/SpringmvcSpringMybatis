package cn.ssm.dao;

import org.springframework.stereotype.Repository;

import cn.ssm.pojo.User;

@Repository("UserDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	//利用构造方法初始化namespace
	public UserDaoImpl(){
		super.setNs("cn.ssm.pojo.UserMapper");
	}
}
