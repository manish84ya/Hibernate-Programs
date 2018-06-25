package com.BookPages;


public class PagesDTO {
	private Integer cpid;
	private String pno;
	private Integer fid;
	private BookDTO obj;
	public Integer getCpid() {
		return cpid;
	}
	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public BookDTO getObj() {
		return obj;
	}
	public void setObj(BookDTO obj) {
		this.obj = obj;
	}
	
}
