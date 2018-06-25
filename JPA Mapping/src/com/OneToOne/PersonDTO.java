package com.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="Person")

public class PersonDTO {
@Id
@Column(name="Person_Id")

private Integer pid;


@Column(name="Person_name")
private String pname;

@Column(name="Gender")
private String gen;

@OneToOne(targetEntity=AdharDTO.class,cascade=CascadeType.ALL)
@JoinColumn(name="Adhar_id",referencedColumnName="aid")

private AdharDTO parent;

public AdharDTO getParent() {
	return parent;
}

public void setParent(AdharDTO parent) {
	this.parent = parent;
}

public Integer getPid() {
	return pid;
}

public void setPid(Integer pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getGen() {
	return gen;
}

public void setGen(String gen) {
	this.gen = gen;
}



}
