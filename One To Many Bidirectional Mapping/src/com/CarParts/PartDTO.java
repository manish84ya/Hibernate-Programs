package com.CarParts;


public class PartDTO {
	private Integer pid;
	private String pname;
	private String ptype;
    private Integer fid;
	private CarDTO obj;
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
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public CarDTO getObj() {
		return obj;
	}
	public void setObj(CarDTO obj) {
		this.obj = obj;
	}
}
