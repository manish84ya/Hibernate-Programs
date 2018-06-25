package com.CompanyProduct;


public class ProductDTO {
	private Integer pid;
	private String pname;
	private String ptype;
	private Integer fid;
	private CompanyDTO obj;
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
	public CompanyDTO getObj() {
		return obj;
	}
	public void setObj(CompanyDTO obj) {
		this.obj = obj;
	}

}
