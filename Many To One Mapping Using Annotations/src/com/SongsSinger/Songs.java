package com.SongsSinger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Songs")

public class Songs {
@Id
@Column(name="songs_id")
private Integer songs_id;

@Column(name="songs_name")
private String songs_name;

@Column(name="Music_comp_name")
private String Music_comp_name;

@ManyToOne(targetEntity=Singer.class,cascade = CascadeType.ALL)
@JoinColumn(name="singer_id",referencedColumnName="singer_id")
private Singer obj;

public Integer getSongs_id() {
	return songs_id;
}

public void setSongs_id(Integer songs_id) {
	this.songs_id = songs_id;
}

public String getSongs_name() {
	return songs_name;
}

public void setSongs_name(String songs_name) {
	this.songs_name = songs_name;
}

public String getMusic_comp_name() {
	return Music_comp_name;
}

public void setMusic_comp_name(String music_comp_name) {
	Music_comp_name = music_comp_name;
}

public Singer getObj() {
	return obj;
}

public void setObj(Singer obj) {
	this.obj = obj;
}

	
}
