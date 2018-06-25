package com.BookPublisher;

import java.util.Set;

public class PublisherDTO {
private Integer pid;
private String pname;
private Set Book;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Set getBook() {
	return Book;
}
public void setBook(Set book) {
	Book = book;
}

}
