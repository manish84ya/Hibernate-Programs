package com.PersonAdhar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adhar")

public class AdharDTO {
@Id
@Column(name="aid")
private Integer aid;

@Column(name="date_of_birth")
private String dob;

@Column(name="Address")
private String adr;

@Column(name="City")
private String city;

@Column(name="Pincode")
private Integer pin;

@Column(name="Mobile_number")
private String mob;

public Integer getAid() {
	return aid;
}

public void setAid(Integer aid) {
	this.aid = aid;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getAdr() {
	return adr;
}

public void setAdr(String adr) {
	this.adr = adr;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Integer getPin() {
	return pin;
}

public void setPin(Integer pin) {
	this.pin = pin;
}

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

	
}
