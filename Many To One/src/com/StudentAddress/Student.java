package com.StudentAddress;

import com.CustomerVendor.Vendor;

public class Student {
	private Integer Sid;
	private String Sname;
	private Address obj;
	public Integer getSid() {
		return Sid;
	}
	public void setSid(Integer sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	
	
}
