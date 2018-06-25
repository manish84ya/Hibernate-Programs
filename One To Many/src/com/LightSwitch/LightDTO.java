package com.LightSwitch;

import java.util.Set;

public class LightDTO {
//This program for Light switch or fan switch or bulb switch.....	
private Integer lid;
private String ltype;
private Set Child;
public Integer getLid() {
	return lid;
}
public void setLid(Integer lid) {
	this.lid = lid;
}
public String getLtype() {
	return ltype;
}
public void setLtype(String ltype) {
	this.ltype = ltype;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}


}
