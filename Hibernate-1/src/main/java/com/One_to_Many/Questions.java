package com.One_to_Many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesId;
	
	private String quesName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "QuestionID")
	private List<Answers> answers;

	public Questions() {
		super();
	}

	public Questions(int quesId, String quesName, List<Answers> answers) {
		super();
		this.quesId = quesId;
		this.quesName = quesName;
		this.answers = answers;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQuesName() {
		return quesName;
	}

	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questions [quesId=" + quesId + ", quesName=" + quesName + ", answers=" + answers + "]";
	}
	
	

}
