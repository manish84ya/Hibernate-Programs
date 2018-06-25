package com.BookAuthor;

import java.util.Set;

public class Book 
{
	private Integer bid;
	private String bname;
	private String ISBN;
	private Set ch;
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
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Set getCh() {
		return ch;
	}
	public void setCh(Set ch) {
		this.ch = ch;
	}
}
