package com.ItemCategories;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")

public class Categories {
@Id 
@Column(name="cid")
private Integer cid;

@Column(name="Cat_Name")
private String cname;
@ManyToMany(targetEntity=Items.class,cascade=CascadeType.ALL)
@JoinTable(name="cate_items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="cid"),inverseJoinColumns=@JoinColumn(name="it_id_fk",referencedColumnName="iid"))
private Set items;
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
public Set getItems() {
	return items;
}
public void setItems(Set items) {
	this.items = items;
}




	
}
