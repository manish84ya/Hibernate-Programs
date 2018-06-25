package com.MoviesActor;

public class ActorDTO {
private Integer aid;
private String aname;
private Integer fid;
private MoviesDTO obj;
public Integer getAid() {
	return aid;
}
public void setAid(Integer aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public Integer getFid() {
	return fid;
}
public void setFid(Integer fid) {
	this.fid = fid;
}
public MoviesDTO getObj() {
	return obj;
}
public void setObj(MoviesDTO obj) {
	this.obj = obj;
}

}
