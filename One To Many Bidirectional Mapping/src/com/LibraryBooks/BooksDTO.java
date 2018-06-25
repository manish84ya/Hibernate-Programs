package com.LibraryBooks;

public class BooksDTO {
private Integer bid;
private String bname;
private String btype;
private Integer fid;
private LibraryDTO obj;
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
public String getBtype() {
	return btype;
}
public void setBtype(String btype) {
	this.btype = btype;
}
public Integer getFid() {
	return fid;
}
public void setFid(Integer fid) {
	this.fid = fid;
}
public LibraryDTO getObj() {
	return obj;
}
public void setObj(LibraryDTO obj) {
	this.obj = obj;
}

}
