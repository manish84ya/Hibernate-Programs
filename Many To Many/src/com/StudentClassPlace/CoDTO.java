package com.StudentClassPlace;

import java.util.Set;

public class CoDTO {
	private Integer cid;
	private String cname;
	private Integer cdur;
	private Set Students;
	private Set Place;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getCdur() {
		return cdur;
	}
	public void setCdur(Integer cdur) {
		this.cdur = cdur;
	}
	public Set getStudents() {
		return Students;
	}
	public void setStudents(Set students) {
		Students = students;
	}
	public Set getPlace() {
		return Place;
	}
	public void setPlace(Set place) {
		Place = place;
	}
	
	
	
}
