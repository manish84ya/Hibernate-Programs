package com.StudentAddress;

public class AddressDTO {
private Integer aid;
private String city;
private String state;
private StudentDTO ss;
private Integer fid;

public Integer getFid() {
	return fid;
}
public void setFid(Integer fid) {
	this.fid = fid;
}
public Integer getAid() {
	return aid;
}
public void setAid(Integer aid) {
	this.aid = aid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public StudentDTO getSs() {
	return ss;
}
public void setSs(StudentDTO ss) {
	this.ss = ss;
}


}
