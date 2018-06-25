package com.EmployeeCertificate;

import java.util.Set;

public class EmployeeDTO {
private Integer eid;
private String ename;
private Integer salary;
private Set certificates;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Set getCertificates() {
	return certificates;
}
public void setCertificates(Set certificates) {
	this.certificates = certificates;
}

}
