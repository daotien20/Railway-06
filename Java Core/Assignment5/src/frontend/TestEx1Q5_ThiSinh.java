package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.beEx1Q5_ITuyenSinh;
import backend.beEx1Q5_TuyenSinh;

public class TestEx1Q5_ThiSinh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<beEx1Q5_TuyenSinh> dsThiSinh = new ArrayList<beEx1Q5_TuyenSinh>();
		beEx1Q5_TuyenSinh thiSinh = new beEx1Q5_TuyenSinh();
		
		while(true) {
		
			System.out.println("Chương trình quản lý thí sinh dự thi đại học");
			System.out.println("1: Thêm mới thí sinh");
			System.out.println("2: Hiển thị thông tin của thí sinh và khối thi của thí sinh");
			System.out.println("3: Tìm kiếm theo số báo danh");
			System.out.println("4: Thoát khỏi chương trình");
			System.out.println("===========================================================");
			System.out.println("Mời chọn chương trình từ 1 đến 4");
			
			int y = scanner.nextInt();
			scanner.nextLine();
			if(y == 1) {
				while(true) {
					System.out.println("THÊM MỚI THÍ SINH");
				
					thiSinh.addNewTS();
					dsThiSinh.add(thiSinh);
					System.out.println("");
					System.out.println("Bạn có muốn thêm mới thí sinh không?");
					System.out.println("1: Có; 2: Không");
					int a = scanner.nextInt();
					scanner.nextLine();
					
					if(a == 1) {
						continue;
					}else {
						break;
					}
					
				}
				
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int b = scanner.nextInt();
				scanner.nextLine();
				if(b == 1) {
					continue;
				}else {
					thiSinh.outProgram();
				}
					
			}else if(y == 2) {
				System.out.println("THÔNG TIN THÍ SINH");
				thiSinh.inforTS();
				System.out.println("");
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int b = scanner.nextInt();
				scanner.nextLine();
				if(b == 1) {
					continue;
				}else {
					thiSinh.outProgram();
				}
			}else if(y == 3) {
				while(true) {
					System.out.println("TÌM KIẾM THEO SỐ BÁO DANH");
					thiSinh.searchTS();
					
					System.out.println("");
					System.out.println("Bạn có muốn tìm kiếm tiếp không?");
					System.out.println("1: Có; 2: Không");
					int a = scanner.nextInt();
					scanner.nextLine();
					
					if(a == 1) {
						continue;
					}else {
						break;
					}
					
				}
				
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int b = scanner.nextInt();
				scanner.nextLine();
				if(b == 1) {
					continue;
				}else {
					thiSinh.outProgram();
				}
				
			}else if(y == 4) {
				thiSinh.outProgram();
				break;
			}else {
				System.out.println("Nhập sai! Mời nhập lại");
				continue;
			}
		}

	}
}
