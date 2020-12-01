package com.vti.entity;

public class Ex2_3Answer {
	private int			answer_id;
	private String		content;
	private Ex2_3Question	question;
	private boolean		is_correct;
	
	public Ex2_3Answer() {
		super();
	}

	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", content=" + content + ", question=" + question + ", is_correct="
				+ is_correct + "]";
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public String getContent() {
		return content;
	}

	public Ex2_3Question getQuestion() {
		return question;
	}

	public boolean isIs_correct() {
		return is_correct;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setQuestion(Ex2_3Question question) {
		this.question = question;
	}

	public void setIs_correct(boolean is_correct) {
		this.is_correct = is_correct;
	}
	
	
	
	
	
}
