package com.CountryStates;

import java.util.Set;

public class Country {
private Integer cid;
private String cname;
private Set Child;
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
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}
}
