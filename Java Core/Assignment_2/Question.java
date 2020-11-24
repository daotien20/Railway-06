package Assignment_2;

import java.time.LocalDate;

public class Question {
	int						questionID;
	String					content;
	CategoryQuestion		category;
	TypeQuestion			type;
	Account					creator;
	LocalDate				createDate;
	Exam[]					exams;
}
