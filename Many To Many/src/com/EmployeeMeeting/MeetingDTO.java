package com.EmployeeMeeting;

import java.util.Set;

public class MeetingDTO {
private Integer mid;
private String subject;
private String md;
private Set Emp;
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMd() {
	return md;
}
public void setMd(String md) {
	this.md = md;
}
public Set getEmp() {
	return Emp;
}
public void setEmp(Set emp) {
	Emp = emp;
}

}
