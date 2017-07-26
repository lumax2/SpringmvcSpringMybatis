package cn.ssm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	//spring和mybatis整合后，会利用set注入sqlSessionFactory
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private String ns;	//在调用前必须设置这个值，命名空间
	public void setNs(String ns) {
		this.ns = ns;
	}

	public List<T> findAll() {
		return getSqlSession().selectList(ns+".findAll");
	}

}
