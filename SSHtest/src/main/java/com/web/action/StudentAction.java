package com.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.web.pojo.Students;
import com.web.service.IstudentsService;



@Controller
public class StudentAction {
	public StudentAction() {
		// TODO Auto-generated constructor stub
	}
	private Students stu;
	private List<Students> list;
	public Students getStu() {
		return stu;
	}
	public void setStu(Students stu) {
		this.stu = stu;
	}
	
	public List<Students> getList() {
		return list;
	}
	public void setList(List<Students> list) {
		this.list = list;
	}
	@Autowired
	private IstudentsService studentsService;
	
	public String save() {
		studentsService.save(stu);
		return "show";
	}
	public String findAll() {
		list=studentsService.findAll();
		System.out.println(list);
		return "jsp";
	}
}
