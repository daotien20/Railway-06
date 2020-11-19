package Assignment_1;

import Assignment_1.Account;

public class Data_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department	department1 = new Department ();
		department1.department_id = 1;
		department1.department_name = "Sale";
		
		Department	department2 = new Department ();
		department2.department_id = 2;
		department2.department_name = "Marketing";
		
		Department	department3 = new Department ();
		department3.department_id = 3;
		department3.department_name = "Test";
		
		Position	position1 = new Position ();
		position1.position_id = 1;
		position1.position_name = positionName.DEV;
		
		Position	position2 = new Position ();
		position2.position_id = 2;
		position2.position_name = positionName.PM;
		
		
		Position	position3 = new Position ();
		position3.position_id = 3;
		position3.position_name = positionName.SCUM_MASTER;
		
		Account	account1 = new Account ();
		account1.account_id = 1;
		account1.email = "cuongnm@gmail.com";
		account1.user_name = "cuongnm";
		account1.full_name = "nguyen cuong";
		account1.department_id = department1;
		account1.position_id = position2;
		
		
		
		System.out.println(account1.full_name);
//		System.out.println(account1.email);
//		System.out.println(account1.department_id.department_id);
//		System.out.println(account1.department_id.department_name);

		//System.out.println(account1.department_id.department_name);
		//department_id: cua bang Account, department_name: cua bang Department
		
		
	}

}
