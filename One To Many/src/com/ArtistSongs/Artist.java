package com.ArtistSongs;

import java.util.Set;

public class Artist {

	private Integer aid;
	private String aname;
	private Set Child;
	public Integer getAid() {
		return aid;
	}
	public Set getChild() {
		return Child;
	}
	public void setChild(Set child) {
		Child = child;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
