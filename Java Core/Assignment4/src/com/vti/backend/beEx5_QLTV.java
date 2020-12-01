package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex5_Bao;
import com.vti.entity.Ex5_CanBo;
import com.vti.entity.Ex5_Sach;
import com.vti.entity.Ex5_TaiLieu;
import com.vti.entity.Ex5_TapChi;

public class beEx5_QLTV {
	List<Ex5_TaiLieu> cacTaiLieu = new ArrayList<Ex5_TaiLieu>();
	
	public void addNewTL() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Thêm mới tài liệu: ");
			System.out.println("1: Sách; 2: Tạp chí; 3: Báo");
			int x = scanner.nextInt();
			scanner.nextLine();
			if (x == 1) {
				System.out.println("Thêm Sách vào thư viện");
				Ex5_Sach taiLieu1 = new Ex5_Sach();
				taiLieu1.inputSach();
				
				cacTaiLieu.add(taiLieu1);
				break;
				
			}else if (x == 2) {
				System.out.println("Thêm Tạp chí vào thư viện");
				Ex5_TapChi taiLieu1 = new Ex5_TapChi();
				taiLieu1.inputTapChi();;
				
				cacTaiLieu.add(taiLieu1);
				break;
				
			}else if (x == 3) {
				System.out.println("Thêm Báo vào thư viện");
				Ex5_Bao taiLieu1 = new Ex5_Bao();
				taiLieu1.inputBao();
				
				cacTaiLieu.add(taiLieu1);
				break;
			}else {
				System.out.println("Nhập sai! Mời nhập lại!");
			}
			continue;
		}
	}

	public void deleteTL() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu muốn xóa: ");
		int maTL = scanner.nextInt();
		
		for(int i = 0; i < cacTaiLieu.size();) {
			if(cacTaiLieu.get(i).getMaTaiLieu() == maTL){
				cacTaiLieu.remove(i);				
			}else {
				i++;
			}
		}


	}

	public void infoTL() {
		for (Ex5_TaiLieu taiLieu: cacTaiLieu) {
			System.out.println("");
			System.out.println("Done!");
			taiLieu.getInforTL();;
		}
	}

	public void searchTL() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập MTL muốn tìm kiếm: ");
		int maTL = scanner.nextInt();
		
		for (Ex5_TaiLieu taiLieu: cacTaiLieu) {
			if(maTL == taiLieu.getMaTaiLieu())
			System.out.println("Done!");
			taiLieu.getInforTL();
		}
	}
	
	public void outProgram() {
		System.out.println("Chương trình đã kết thúc!");
	}
}
