package com.BookPublisher;

import java.util.Set;

public class BookDTO {
private Integer bid;
private String bname;
private Set Publisher;
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
public Set getPublisher() {
	return Publisher;
}
public void setPublisher(Set publisher) {
	Publisher = publisher;
}

}
