package com.MultipleTablesMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Player")
@Data
public class PlayerDTO 
{
	@Id
	@Column(name="pid")
	private Long pid;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="page")
	private Integer page;
	
	

}
