package com.MoviesActor;

import java.util.Set;

public class MoviesDTO {
private Integer mid;
private String mname;
private Integer mdur;
private Set Child;
public Integer getMid() {
	return mid;
}
public void setMid(Integer mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public Integer getMdur() {
	return mdur;
}
public void setMdur(Integer mdur) {
	this.mdur = mdur;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}
}
