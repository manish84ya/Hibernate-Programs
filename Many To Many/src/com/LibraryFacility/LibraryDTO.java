package com.LibraryFacility;

import java.util.Set;

public class LibraryDTO {

	private Integer lid;
	private String lname;
	private Set Facility;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Set getFacility() {
		return Facility;
	}
	public void setFacility(Set facility) {
		Facility = facility;
	}
	
}
