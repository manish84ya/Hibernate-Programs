package com.CommentPost;

public class Comment {
private Integer cid;
private String com;
private String cby;
private Post obj;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCom() {
	return com;
}
public void setCom(String com) {
	this.com = com;
}
public String getCby() {
	return cby;
}
public void setCby(String cby) {
	this.cby = cby;
}
public Post getObj() {
	return obj;
}
public void setObj(Post obj) {
	this.obj = obj;
}
}
