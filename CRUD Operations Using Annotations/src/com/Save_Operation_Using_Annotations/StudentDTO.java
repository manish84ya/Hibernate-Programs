package com.Save_Operation_Using_Annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_detail")
public class StudentDTO {

@Id
@Column(name="Student_id")
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer sid;

@Column(name="student_name",length=10)
private String sname;

@Column(name="RollNumber",length=10)
private Integer rollumber;

@Column(name="Branch",length=10)
private String branch;

@Column(name="Year",length=10)
private String year;

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
public Integer getRollumber() {
	return rollumber;
}
public void setRollumber(Integer rollumber) {
	this.rollumber = rollumber;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}


}
