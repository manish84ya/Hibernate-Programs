package com.CartProduct;

import java.util.Set;

public class Cart {
private Integer cid;
private String Name;
private Set child;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Set getChild() {
	return child;
}
public void setChild(Set child) {
	this.child = child;
}


}
