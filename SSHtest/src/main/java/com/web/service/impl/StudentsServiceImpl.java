package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.IstudentsDAO;
import com.web.dao.impl.IstudentsDAOImpl;
import com.web.pojo.Students;
import com.web.service.IstudentsService;

@Service
@Transactional
public class StudentsServiceImpl implements IstudentsService {
	public StudentsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private IstudentsDAO istudentsDAO;
	
	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return istudentsDAO.findAll();
	}

	@Override
	public void save(Students obj) {
		// TODO Auto-generated method stub
		istudentsDAO.save(obj);
	}
	
}
