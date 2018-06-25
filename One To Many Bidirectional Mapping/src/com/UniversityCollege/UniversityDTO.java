package com.UniversityCollege;

import java.util.Set;

public class UniversityDTO {
	private Integer uid;
	private String uname;
	private Set Child;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}
	
}
