package Assignment_3;

import Assignment_3.Department;

public class Ex5ObjectsMethod {

	public static void main(String[] args) {
		question1Toi5();
		
	}

	private static void question1Toi5() {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Sale";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Marketing";
		
		Department department4 = new Department();
		department3.departmentID = 4;
		department3.departmentName = "ABC";
		
		Department[] departments = {department1, department2, department3, department4};
		
		System.out.println("Question 1: In ra thông tin phòng ban thứ nhất");
		System.out.println(departments[0].toString());
		
		System.out.println("");	
		System.out.println("Question 2: In ra thông tin của tất cả các phòng ban");
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i].toString());
			}
		
		System.out.println("");
		System.out.println("Question 3: In ra địa chỉ của phòng ban thứ 1");
		System.out.println(departments[0].hashCode());
		
		System.out.println("");
		System.out.println("Question 4: Kiểm tra xem phòng ban thứ 1 có tên 'Phòng A' không");
		String s1 = "Phòng A";
		System.out.println(departments[0].departmentName.equals(s1));
		
		System.out.println("");
		System.out.println("Question 5: So sánh phòng ban 1 có bằng phòng ban 2 không");
		System.out.println(department1.equals(department2));
		
	}

}
