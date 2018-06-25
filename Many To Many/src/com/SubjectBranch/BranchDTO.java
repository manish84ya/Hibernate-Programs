package com.SubjectBranch;

import java.util.Set;

public class BranchDTO {
private Integer bid;
private String bname;
private Set Subject;
public Integer getBid() {
	return bid;
}
public void setBid(Integer bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public Set getSubject() {
	return Subject;
}
public void setSubject(Set subject) {
	Subject = subject;
}

}
