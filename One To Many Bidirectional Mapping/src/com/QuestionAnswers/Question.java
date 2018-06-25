package com.QuestionAnswers;

import java.util.Set;

public class Question {
private Integer qid;
private String ques;
private Set Child;
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public String getQues() {
	return ques;
}
public void setQues(String ques) {
	this.ques = ques;
}
public Set getChild() {
	return Child;
}
public void setChild(Set child) {
	Child = child;
}

}
