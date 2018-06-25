package com.BankCustomer;

import java.util.Set;

public class Bank 
{
	private Integer Bid;
	private String Bname;
	private Set ch;
	public Integer getBid() {
		return Bid;
	}
	public void setBid(Integer bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public Set getCh() {
		return ch;
	}
	public void setCh(Set ch) {
		this.ch = ch;
	}
	
}
