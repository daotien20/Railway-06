package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex2_3Exam {
	private short				examID;
	private String				code;
	private String				title;
	private short				duration;
	private Ex2_3Account				creator;
	private LocalDate			createDate;
	private Ex2_3CategoryQuestion	category;
	private Ex2_3Question[]			questions;
	
	public Ex2_3Exam() {
		super();
	}

	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", code=" + code + ", title=" + title + ", duration=" + duration
				+ ", creator=" + creator + ", createDate=" + createDate + ", category=" + category + ", questions="
				+ Arrays.toString(questions) + "]";
	}

	public short getExamID() {
		return examID;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public short getDuration() {
		return duration;
	}

	public Ex2_3Account getCreator() {
		return creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Ex2_3CategoryQuestion getCategory() {
		return category;
	}

	public Ex2_3Question[] getQuestions() {
		return questions;
	}

	public void setExamID(short examID) {
		this.examID = examID;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDuration(short duration) {
		this.duration = duration;
	}

	public void setCreator(Ex2_3Account creator) {
		this.creator = creator;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setCategory(Ex2_3CategoryQuestion category) {
		this.category = category;
	}

	public void setQuestions(Ex2_3Question[] questions) {
		this.questions = questions;
	}
	
	
	
	
	
}
