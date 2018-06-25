package com.StudentCourses;

import java.util.Set;

public class StudentDTO {
private Integer sid;
private String sname;
private Integer marks;
private Set courses;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public Set getCourses() {
	return courses;
}
public void setCourses(Set courses) {
	this.courses = courses;
}

}
