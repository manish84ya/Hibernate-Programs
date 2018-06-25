package com.StockCategory;

import java.util.Set;

public class StockDTO {
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set Category;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Set getCategory() {
		return Category;
	}
	public void setCategory(Set category) {
		Category = category;
	}
}
