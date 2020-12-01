package Assignment_2;

import java.time.LocalDate;

public class Exam {
	short				examID;
	String				code;
	String				title;
	short				duration;
	Account				creator;
	LocalDate			createDate;
	CategoryQuestion	category;
	Question[]			questions;
}
