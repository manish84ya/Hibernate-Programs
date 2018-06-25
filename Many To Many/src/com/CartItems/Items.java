package com.CartItems;

import java.util.Set;

public class Items {

	private long iid;
	private double price;
	private String description;
	private Set carts;
	
	public long getIid() {
		return iid;
	}
	public void setIid(long iid) {
		this.iid = iid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set getCarts() {
		return carts;
	}
	public void setCarts(Set carts) {
		this.carts = carts;
	}
	
}
