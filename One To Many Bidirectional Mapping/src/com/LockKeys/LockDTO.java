package com.LockKeys;

import java.util.Set;

public class LockDTO {
private Integer lid;
private String lcname;
private Integer lnumofkey;
private Set Child;
public Integer getLid() {
	return lid;
}
public void setLid(Integer lid) {
	this.lid = lid;
}
public String getLcname() {
	return lcname;
}
public void setLcname(String lcname) {
	this.lcname = lcname;
}
public Integer getLnumofkey() {
	return lnumofkey;
}
public void setLnumofkey(Integer lnumofkey) {
	this.lnumofkey = lnumofkey;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}
}
