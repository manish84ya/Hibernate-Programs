package com.SongsSinger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Singer")

public class Singer {
@Id
@Column(name="singer_id")
private Integer singer_id;

@Column(name="singer_name")
private String sname;

public Integer getSinger_id() {
	return singer_id;
}

public void setSinger_id(Integer singer_id) {
	this.singer_id = singer_id;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

	
}
