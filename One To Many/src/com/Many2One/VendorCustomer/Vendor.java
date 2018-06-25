package com.Many2One.VendorCustomer;

import java.util.Set;

public class Vendor 
{
	private Integer Vid;
	private String Vname;
	private Set children;
	
	public Integer getVid() {
		return Vid;
	}
	public void setVid(Integer vid) {
		Vid = vid;
	}
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
}
