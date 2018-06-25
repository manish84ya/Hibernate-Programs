package com.LibraryFacility;

import java.util.Set;

public class FacilityDTO {
private Integer fcode;
private String fdesc;
private Set Library;
public Integer getFcode() {
	return fcode;
}
public void setFcode(Integer fcode) {
	this.fcode = fcode;
}
public String getFdesc() {
	return fdesc;
}
public void setFdesc(String fdesc) {
	this.fdesc = fdesc;
}
public Set getLibrary() {
	return Library;
}
public void setLibrary(Set library) {
	Library = library;
}

}
