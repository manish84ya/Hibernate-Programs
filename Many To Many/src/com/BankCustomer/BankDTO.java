package com.BankCustomer;

import java.util.Set;

public class BankDTO {

	private Integer bid;
	private String bname;
	private String branch;
	private Set Customer;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Set getCustomer() {
		return Customer;
	}
	public void setCustomer(Set customer) {
		Customer = customer;
	}
	
}
