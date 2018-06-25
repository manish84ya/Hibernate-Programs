package com.CustomerSecondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

@Entity
@Table(name="Customer25")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY,region ="customer")

public class Customer 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "ID")
private Integer id;

@Column(name="name")
private String name;

@Column(name="mob")
private Long mob;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getMob() {
	return mob;
}

public void setMob(Long mob) {
	this.mob = mob;
}

	
}
