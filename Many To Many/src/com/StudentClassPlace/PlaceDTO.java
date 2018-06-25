package com.StudentClassPlace;

import java.util.Set;

public class PlaceDTO {
private Integer pid;
private String pname;
private Set Student;
private Set Courses;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Set getStudent() {
	return Student;
}
public void setStudent(Set student) {
	Student = student;
}
public Set getCourses() {
	return Courses;
}
public void setCourses(Set courses) {
	Courses = courses;
}


}
