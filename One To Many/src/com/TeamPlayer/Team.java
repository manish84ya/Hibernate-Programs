package com.TeamPlayer;

import java.util.Set;

public class Team {

	private Integer tid;
	private String tname;
	private Set Child;
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
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}
	
}
