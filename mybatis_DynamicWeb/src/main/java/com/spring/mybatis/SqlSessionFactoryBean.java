package com.spring.mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
	private SqlSessionFactory factory;
	public SqlSessionFactoryBean() {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public SqlSession getSession() {
		return factory.openSession();
	}
}
