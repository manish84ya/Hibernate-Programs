package com.ProjectManagerToProject;

import java.util.Set;

public class ProjectManager {
private Integer pmid;
private String Pname;
private Set Child;
public Integer getPmid() {
	return pmid;
}
public void setPmid(Integer pmid) {
	this.pmid = pmid;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}

}
