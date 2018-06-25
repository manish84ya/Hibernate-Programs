package com.BankCustomer;

import java.util.Set;

public class CustomerDTO {
private Integer cid;
private String cname;
private Integer acc;
private Set Bank;
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
public Integer getAcc() {
	return acc;
}
public void setAcc(Integer acc) {
	this.acc = acc;
}
public Set getBank() {
	return Bank;
}
public void setBank(Set bank) {
	Bank = bank;
}

}
