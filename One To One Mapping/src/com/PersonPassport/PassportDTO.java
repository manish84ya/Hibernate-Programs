package com.PersonPassport;

public class PassportDTO {
private Integer pssid;
private Integer pnumber;
private String issueD;
private String expD;
private Integer ppage;
private PersonDTO pp;

public Integer getPssid() {
	return pssid;
}
public void setPssid(Integer pssid) {
	this.pssid = pssid;
}
public Integer getPnumber() {
	return pnumber;
}
public void setPnumber(Integer pnumber) {
	this.pnumber = pnumber;
}
public String getIssueD() {
	return issueD;
}
public void setIssueD(String issueD) {
	this.issueD = issueD;
}
public String getExpD() {
	return expD;
}
public void setExpD(String expD) {
	this.expD = expD;
}
public Integer getPpage() {
	return ppage;
}
public void setPpage(Integer ppage) {
	this.ppage = ppage;
}
public PersonDTO getPp() {
	return pp;
}
public void setPp(PersonDTO pp) {
	this.pp = pp;
}



}
