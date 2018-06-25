package com.CustomerBank;

public class Customer1 {
	private Integer Cid;
	private String Cname;
	private Integer Acc;
	private Bank obj;
	public Bank getObj() {
		return obj;
	}
	public void setObj(Bank obj) {
		this.obj = obj;
	}
	public Integer getCid() {
		return Cid;
	}
	public void setCid(Integer cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public Integer getAcc() {
		return Acc;
	}
	public void setAcc(Integer acc) {
		Acc = acc;
	}

}
