package com.LibraryBooks;

import java.util.Set;

public class LibraryDTO {
private Integer lid;
private String lname;
private String cname;
private Set Child;
public Integer getLid() {
	return lid;
}
public void setLid(Integer lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}

}
