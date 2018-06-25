package com.PostsTag;

import java.util.Set;

public class PostDTO {
private Integer pid;
private String ptitle;
private String pdesc;
private String pdate;
private Set Tag;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPtitle() {
	return ptitle;
}
public void setPtitle(String ptitle) {
	this.ptitle = ptitle;
}
public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
public String getPdate() {
	return pdate;
}
public void setPdate(String pdate) {
	this.pdate = pdate;
}
public Set getTag() {
	return Tag;
}
public void setTag(Set tag) {
	Tag = tag;
}

}
