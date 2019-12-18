package com.web.pojo;

import java.util.Date;

// Generated 2019-12-17 16:24:53 by Hibernate Tools 3.4.0.CR1



/**
 * Students generated by hbm2java
 */
public class Students implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sid;
	private String sname;
	private Date stoday;

	public Students() {
	}

	
	
	public Students(Integer sid, String sname, Date stoday) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.stoday = stoday;
	}



	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getStoday() {
		return this.stoday;
	}

	public void setStoday(Date stoday) {
		this.stoday = stoday;
	}



	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", stoday=" + stoday + "]";
	}

}