package com.ClassStudent;

import com.VendorCustomer.Vendor;

public class StudentDTO {
	private Integer sid;
	private String sname;
	private Integer fid;
	private ClassDTO obj;
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
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public ClassDTO getObj() {
		return obj;
	}
	public void setObj(ClassDTO obj) {
		this.obj = obj;
	}
}
