package com.web.service;

import java.util.List;

import com.web.pojo.Students;

public interface IstudentsService {
	public void save(Students obj);
	public List<Students> findAll();
}
