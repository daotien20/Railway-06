package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex5_CanBo;
import com.vti.entity.Ex5_HighSchoolStudent;

public class beEx5_HighSchoolStudent {
	public void demoHighSchool() {
		
		List<Ex5_HighSchoolStudent> danhsachStudent = new ArrayList<Ex5_HighSchoolStudent>();
		
		Ex5_HighSchoolStudent student = new Ex5_HighSchoolStudent();
		student.setId(1);
		student.setName("Nam");
		student.setClazz("Chuyên Văn");
		student.setDesiredUniversity("Đại học Công Nghệ");
		
		System.out.println(student);
	} 
}


