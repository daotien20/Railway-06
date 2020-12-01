package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex2_3Question {
	private int						questionID;
	private String					content;
	private Ex2_3CategoryQuestion		category;
	private Ex2_3TypeQuestion			type;
	private Ex2_3Account					creator;
	private LocalDate				createDate;
	private Ex2_3Exam[]					exams;
	
	public Ex2_3Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", content=" + content + ", category=" + category + ", type="
				+ type + ", creator=" + creator + ", createDate=" + createDate + ", exams=" + Arrays.toString(exams)
				+ "]";
	}

	public int getQuestionID() {
		return questionID;
	}

	public String getContent() {
		return content;
	}

	public Ex2_3CategoryQuestion getCategory() {
		return category;
	}

	public Ex2_3TypeQuestion getType() {
		return type;
	}

	public Ex2_3Account getCreator() {
		return creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Ex2_3Exam[] getExams() {
		return exams;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCategory(Ex2_3CategoryQuestion category) {
		this.category = category;
	}

	public void setType(Ex2_3TypeQuestion type) {
		this.type = type;
	}

	public void setCreator(Ex2_3Account creator) {
		this.creator = creator;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setExams(Ex2_3Exam[] exams) {
		this.exams = exams;
	}
	
	
	
	
}
