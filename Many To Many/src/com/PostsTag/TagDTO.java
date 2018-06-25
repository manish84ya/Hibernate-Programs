package com.PostsTag;

import java.util.Set;

public class TagDTO {
	private Integer tid;
	private String tname;
	private  Set Post;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set getPost() {
		return Post;
	}
	public void setPost(Set post) {
		Post = post;
	}
	
}
