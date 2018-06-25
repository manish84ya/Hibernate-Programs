package com.BookPages;

import java.util.Set;

public class BookDTO {
	private Integer bid;
	private String bname;
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
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}
	private Set Child;
	
}
