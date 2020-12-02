package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Ex1Q5_ThiSinh;

public class beEx1Q5_TuyenSinh implements beEx1Q5_ITuyenSinh {
	List<Ex1Q5_ThiSinh> listTS = new ArrayList<Ex1Q5_ThiSinh>();
	@Override
	public void addNewTS() {
		Ex1Q5_ThiSinh thiSinh = new Ex1Q5_ThiSinh();
		thiSinh.inputTS();
		listTS.add(thiSinh);
	}

	@Override
	public void inforTS() {
		for(Ex1Q5_ThiSinh cacTS : listTS) {
			cacTS.showTS();
			System.out.println("");
		}
	}

	@Override
	public void searchTS() {
		Scanner scanner = new Scanner(System.in);
		int soBD = scanner.nextInt();
		for(Ex1Q5_ThiSinh cacTS : listTS) {
			if(cacTS.getSoBaoDanh() == soBD) {
				cacTS.showTS();
			}
		}
	}

	@Override
	public void outProgram() {
		System.out.println("Chương trình đã kết thúc!");
	}
	
}
