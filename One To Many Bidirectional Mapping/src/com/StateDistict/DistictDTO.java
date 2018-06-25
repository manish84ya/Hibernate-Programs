package com.StateDistict;


public class DistictDTO {
	private Integer cid;
	private String cname;
	private Integer fid;
	private StateDTO obj;
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
	public StateDTO getObj() {
		return obj;
	}
	public void setObj(StateDTO obj) {
		this.obj = obj;
	}
}
