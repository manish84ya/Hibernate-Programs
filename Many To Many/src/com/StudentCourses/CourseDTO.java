package com.StudentCourses;

import java.util.Set;

public class CourseDTO {
	private Integer cid;
	private String cname;
	private Integer cdur;
	private Set Students;
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

}
