package com.AtmCust;

import java.util.Set;

public class AtmDTO {
private Integer Aid;
private String aname;
private String aplace;
private Set Child;
public Integer getAid() {
	return Aid;
}
public void setAid(Integer aid) {
	Aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getAplace() {
	return aplace;
}
public void setAplace(String aplace) {
	this.aplace = aplace;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}

}
