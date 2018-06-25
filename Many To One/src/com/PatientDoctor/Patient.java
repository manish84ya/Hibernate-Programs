package com.PatientDoctor;

public class Patient 
{
	private Integer pid;
	private String pname;
	private String diseases;
	private Doctor obj;
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
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public Doctor getObj() {
		return obj;
	}
	public void setObj(Doctor obj) {
		this.obj = obj;
	}
	
}
