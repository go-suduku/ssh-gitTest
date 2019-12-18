package com.web.dao;

import java.util.List;

import com.web.pojo.Students;

public interface IstudentsDAO {
	void save(Students obj);
	List<Students> findAll();
}
