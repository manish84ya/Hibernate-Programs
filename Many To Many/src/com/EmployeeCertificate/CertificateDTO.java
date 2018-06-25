package com.EmployeeCertificate;

import java.util.Set;

public class CertificateDTO {
	private Integer cid;
	private String cname;
	private String yoc;
	private Set Employee;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getYoc() {
		return yoc;
	}
	public void setYoc(String yoc) {
		this.yoc = yoc;
	}
	public Set getEmployee() {
		return Employee;
	}
	public void setEmployee(Set employee) {
		Employee = employee;
	}
	
	

}
