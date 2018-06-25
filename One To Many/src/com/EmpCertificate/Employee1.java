package com.EmpCertificate;

import java.util.Set;

public class Employee1 {
	 private Integer eId;
	  private String eName;
	 private Set Child;
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

}
