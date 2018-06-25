package com.EmployeeMeeting;

import java.util.Set;

public class EmpDTO {
private Integer eid;
private String ename;
private String esal;
private Set Meeting;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEsal() {
	return esal;
}
public void setEsal(String esal) {
	this.esal = esal;
}
public Set getMeeting() {
	return Meeting;
}
public void setMeeting(Set meeting) {
	Meeting = meeting;
}

}
