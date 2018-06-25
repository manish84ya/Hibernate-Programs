package com.ItemCategories;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Items")

public class Items {
@Id
@Column(name="iid")
private Integer iid;
@Column(name="itemname")
private String item_name;
@ManyToMany(targetEntity=Categories.class,mappedBy="items")
private Set categories;
public Integer getIid() {
	return iid;
}
public void setIid(Integer iid) {
	this.iid = iid;
}
public String getItem_name() {
	return item_name;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public Set getCategories() {
	return categories;
}
public void setCategories(Set categories) {
	this.categories = categories;
}

	
}
