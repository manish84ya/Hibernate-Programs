package com.UniversityCollege;


public class CollegeDTO {
	private Integer cid;
	private String cname;
	private Integer fid;
	private UniversityDTO obj;
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
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public UniversityDTO getObj() {
		return obj;
	}
	public void setObj(UniversityDTO obj) {
		this.obj = obj;
	}

}
