package com.CustomerVendor;

public class Customer 
{
	private Integer cid;
	private String cname;
	private Vendor obj;
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
	public Vendor getObj() {
		return obj;
	}
	public void setObj(Vendor obj) {
		this.obj = obj;
	}
	
}
