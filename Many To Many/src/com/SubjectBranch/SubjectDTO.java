package com.SubjectBranch;

import java.util.Set;

public class SubjectDTO {
private Integer sid;
private String sname;
private String sdesc;
private Set Branch;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdesc() {
	return sdesc;
}
public void setSdesc(String sdesc) {
	this.sdesc = sdesc;
}
public Set getBranch() {
	return Branch;
}
public void setBranch(Set branch) {
	Branch = branch;
}

}
