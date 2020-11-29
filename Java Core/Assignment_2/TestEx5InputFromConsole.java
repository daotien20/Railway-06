package Assignment_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import Assignment_2.Account;

public class TestEx5InputFromConsole {

	public static void main(String[] args) throws ParseException {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10();
//		question11();

	}
	
	private static void question5() {
		Account[] accounts = inputAccounts();
		Group[] groups = inputGroup();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời tạo account: ");

		System.out.println("Nhập Id:");
		int accountID = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập email: ");
		String email = scanner.nextLine();

		System.out.println("Nhập username: ");
		String userName = scanner.nextLine();

		System.out.println("Nhập fullname: ");
		String fullName = scanner.nextLine();
		System.out.println("");
		
		while(true) {
			System.out.println("Nhập position (lựa chọn một số từ 1 đến 4): ");
			System.out.println("1: Dev; 2: Test; 3: Scrum Master; 4: PM");
			int y = scanner.nextInt();
			switch (y) {
			case 1:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban của bạn: " + PositionName.DEV);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 2:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban của bạn: " + PositionName.TEST);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 3:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban của bạn: " + PositionName.SCUM_MASTER);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			case 4:
				System.out.println("");
				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("Phòng ban của bạn: " + PositionName.PM);
				System.out.println("Ngày khởi tạo: " + LocalDate.now());
				break;
			default:
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
			break;
		}
	}

	private static Position[] inputPosititons() {
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;
		
		Position[] positions = {position1, position2, position3};
		
		return positions;
		
	}
	
	private static Account[] inputAccounts() {
		Position[] positions = inputPosititons();
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.position = positions[0];
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.position = positions[2];
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.position = positions[1];
		account3.createDate = LocalDate.of(2019, 12, 23);
		
		Account[] accounts = {account1, account2, account3};
		
		return accounts;
	}
	
	private static Group[] inputGroup() {
		Account[] accounts = inputAccounts();
		
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "group so 1";
		group1.creator = accounts[0];
		group1.createDate = LocalDate.of(2019, 12, 25);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "group so 2";
		group2.creator = accounts[2];
		group2.createDate = LocalDate.of(2019, 12, 25);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "group so 3";
		group3.creator = accounts[1];
		group3.createDate = LocalDate.of(2019, 12, 25);
		
		Group[] groups = {group1, group2, group3};
		
		return groups;
		
	}
	
	private static void question11() {
		Account[] accounts = inputAccounts();
		Group[]	groups = inputGroup();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println(
					"1: Tạo account; 2: Tạo department; 3: Thêm group vào account; 4: Thêm account vào 1 group ngẫu nhiên");
			int a = scanner.nextInt();
			scanner.nextLine();
			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 4) {
				System.out.println("Mời thêm account: ");

				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + " " + accounts[b].userName);
				}

				System.out.println("");

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();
				scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + " " + groups[c].groupName);
				}

				System.out.println("");

				Random random = new Random();
				int n = random.nextInt(groups.length);
				String s2 = "Group của bạn: ";
				System.out.println(s2 + groups[n]);
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + groups[n].groupName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 3) {
				System.out.println("Mời thêm group vào account: ");

				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + " " + accounts[b].userName);
				}

				System.out.println("");

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();
				scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + " " + groups[c].groupName);
				}

				System.out.println("");

				System.out.println("Nhập vào group bạn muốn tham gia: ");
				String s2 = scanner.nextLine();
				System.out.println("");
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + s2);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}
	}

	private static void question10() {
		Account[] accounts = inputAccounts();
		Group[] groups = inputGroup();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1: Tạo account; 2: Tạo department; 3: Thêm group vào account");
			int a = scanner.nextInt();
			scanner.nextLine();

			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Done! Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else if (a == 3) {
				System.out.println("Mời thêm group vào account: ");

				System.out.println("Các usernames: ");
				for (int b = 0; b < accounts.length; b++) {
					System.out.println("STT" + (b + 1) + " " + accounts[b].userName);
				}

				System.out.println("Nhập vào username của bạn: ");
				String s1 = scanner.nextLine();

				System.out.println("Các group: ");
				for (int c = 0; c < groups.length; c++) {
					System.out.println("STT" + (c + 1) + " " + groups[c].groupName);
				}

				System.out.println("");

				System.out.println("Nhập vào group bạn muốn tham gia: ");
				String s2 = scanner.nextLine();
				System.out.println("");
				
				System.out.println("Done!");
				System.out.println("Username: " + s1);
				System.out.println("Group: " + s2);
				System.out.println("");

				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					return;
				}

			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}
	}

	private static void question9() {

		Account[] accounts = inputAccounts();
		Group[] groups = inputGroup();

		System.out.println("Các usernames: ");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("STT" + (i + 1) + " " + accounts[i].userName);
		}

		System.out.println("");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào username của bạn: ");
		String s1 = scanner.nextLine();
		System.out.println("");

		System.out.println("Các group: ");
		for (int a = 0; a < groups.length; a++) {
			System.out.println("STT" + (a + 1) + " " + groups[a].groupName);
		}

		System.out.println("");

		System.out.println("Nhập vào group bạn muốn tham gia: ");
		String s2 = scanner.nextLine();
		System.out.println("");

		System.out.println("Username: " + s1);
		System.out.println("Group: " + s2);
	}

	private static void question8() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1: Tạo account; 2: Tạo department");
			int a = scanner.nextInt();
			if (a == 1) {
				System.out.println("Mời tạo account: ");

				System.out.println("Nhập Id:");
				int accountID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập email: ");
				String email = scanner.nextLine();

				System.out.println("Nhập username: ");
				String userName = scanner.nextLine();

				System.out.println("Nhập fullname: ");
				String fullName = scanner.nextLine();
				System.out.println("");

				System.out.println("Tài khoản của bạn: ");
				System.out.println("ID: " + accountID);
				System.out.println("Email: " + email);
				System.out.println("Username: " + userName);
				System.out.println("Fullname: " + fullName);
				break;
			} else if (a == 2) {
				System.out.println("Mời tạo department: ");

				System.out.println("Nhập Id: ");
				int departmentID = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Nhập tên phòng ban: ");
				String departmentName = scanner.nextLine();
				System.out.println("");

				System.out.println("Phòng ban của bạn: ");
				System.out.println("ID: " + departmentID);
				System.out.println("Tên phòng ban: " + departmentName);
				break;
			} else {
				System.out.println("Mời bạn nhập lại!");
				continue;
			}
		}
	}

	private static void question7() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Nhập vào số chẵn: ");
			int x = scanner.nextInt();
			if (x % 2 != 0) {
				System.out.println("Đây không phải số chẵn");
			} else {
				System.out.println(x + " " + "đúng là số chẵn");
				break;
			}
		}
	}

	private static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ID cua dpartment: ");
		int id1 = scanner.nextInt();
		Department department1 = new Department();
		department1.departmentID = id1;
		scanner.nextLine();
		System.out.println("Nhap vao ten cua department: ");
		department1.departmentName = scanner.nextLine();

		System.out.println(department1.toString());

	}

	@SuppressWarnings("unused")
	private static void question4() throws ParseException {
		System.out.println("Question 4-----------------------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào ngày sinh nhật của bạn (theo định dạng ngày-tháng-năm): ");
		String dateInput = scanner.nextLine();
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dateInput);
		System.out.println("Sinh nhật của bạn: " + date);
				
	}

	private static void question3() {
		System.out.println("Question 3-----------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên");
		System.out.println("Họ của bạn: ");
		String lastName = scanner.nextLine();
		System.out.println("Tên của bạn: ");
		String firstName = scanner.nextLine();
		String s1 = lastName + " " + firstName;
		System.out.println("Họ và tên của bạn: " + s1);

	}

	private static void question2() {
		System.out.println("Question 2-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 3; i++) {
			System.out.println("Nhập vào số thực thứ " + i + ":");
			double x = scanner.nextDouble();
			System.out.println(x);
		}

	}

	private static void question1() {
		System.out.println("Question 1-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 4; i++) {
			System.out.println("Nhập vào số nguyên thứ " + i + ":");
			int x = scanner.nextInt();
			System.out.println(x);
		}
	}

}
