package com.One_to_Many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansId;
	
	private String answerString;
	
	private String postedBy;

	public Answers() {
		super();
	}

	public Answers(int ansId, String answerString, String postedBy) {
		super();
		this.ansId = ansId;
		this.answerString = answerString;
		this.postedBy = postedBy;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswerString() {
		return answerString;
	}

	public void setAnswerString(String answerString) {
		this.answerString = answerString;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		return "Answers [ansId=" + ansId + ", answerString=" + answerString + ", postedBy=" + postedBy + "]";
	}
	
	
	
	
	
	
	

}
