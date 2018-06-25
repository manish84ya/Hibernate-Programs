package com.PagesBook;

public class PagesDTO {
private Integer pagenumber;
private String pheading;
private BookDTO obj;
public Integer getPagenumber() {
	return pagenumber;
}
public void setPagenumber(Integer pagenumber) {
	this.pagenumber = pagenumber;
}
public String getPheading() {
	return pheading;
}
public void setPheading(String pheading) {
	this.pheading = pheading;
}
public BookDTO getObj() {
	return obj;
}
public void setObj(BookDTO obj) {
	this.obj = obj;
}

}
