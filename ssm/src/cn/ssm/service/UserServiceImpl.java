package cn.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;

@Service("UserService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	
	public List<User> findAll() {
		return userDao.findAll();
	}
}
