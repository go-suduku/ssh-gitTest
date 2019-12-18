package com.web.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.dao.IstudentsDAO;
import com.web.pojo.Students;
@Repository
public class IstudentsDAOImpl implements IstudentsDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Students obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Students").list();
	}
	
}
