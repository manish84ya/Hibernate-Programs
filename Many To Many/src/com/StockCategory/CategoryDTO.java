package com.StockCategory;

import java.util.Set;

public class CategoryDTO {
	private Integer categoryId;
	private String cname;
	private String descp;
	private Set Stock;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public Set getStock() {
		return Stock;
	}
	public void setStock(Set stock) {
		Stock = stock;
	}
	
	
}
