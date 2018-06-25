package com.VendorCustomer;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")

public class Vendor {
@Id
@Column(name="vid")
private Integer vid;

@Column(name="vname")
private String vname;
@OneToMany(targetEntity=Customer.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="vid",referencedColumnName="vid")
private Set Children;
public Integer getVid() {
	return vid;
}
public void setVid(Integer vid) {
	this.vid = vid;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
public Set getChildren() {
	return Children;
}
public void setChildren(Set children) {
	Children = children;
}


	
}
