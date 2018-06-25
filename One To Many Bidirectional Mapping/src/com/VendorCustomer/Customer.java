package com.VendorCustomer;

public class Customer {
private Integer cid;
private String cname;
private Integer fid;
private Vendor obj;
@Override
public String toString() {
	return "Customer [fid=" + fid + "]";
}
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Integer getFid() {
	return fid;
}
public void setFid(Integer fid) {
	this.fid = fid;
}
public Vendor getObj() {
	return obj;
}
public void setObj(Vendor obj) {
	this.obj = obj;
}

}
