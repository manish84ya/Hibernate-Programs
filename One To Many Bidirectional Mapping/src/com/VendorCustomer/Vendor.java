package com.VendorCustomer;

import java.util.Set;

public class Vendor {
	private Integer vid;
	private String vname;
	private Set Child;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}

}
