package com.CarEngine;

public class Engine {
private Integer eid;
private String ecname;
private String gearbox;
private Car c;
public Integer getEid() {
	return eid;
}

public String getGearbox() {
	return gearbox;
}

public void setGearbox(String gearbox) {
	this.gearbox = gearbox;
}

public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEcname() {
	return ecname;
}
public void setEcname(String ecname) {
	this.ecname = ecname;
}
public Car getC() {
	return c;
}
public void setC(Car c) {
	this.c = c;
}


}
