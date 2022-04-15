package Override;

import java.util.Scanner;

public class ThiSinh extends Nguoi {
	
	private String sbd;
	private float toan;
	private float ly;
	private float hoa;
	
	public void inPut() {
		super.inPut();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số báo danh: ");
		sbd = sc.nextLine();
		System.out.print("Nhập điểm toán: ");
		toan = sc.nextFloat();
		System.out.print("Nhập điểm lý: ");
		ly = sc.nextFloat();
		System.out.print("Nhập điểm hóa: ");
		hoa = sc.nextFloat();
	}
	
	public void outPut() {
		super.outPut();
		System.out.println("Số báo danh: " + sbd);
		System.out.println("Điểm toán: " + toan);
		System.out.println("Điểm lý: " + ly);
		System.out.println("Điểm hóa: " + hoa);
	}
	
	public boolean check(float diemChuan) {
		float tong = toan + ly + hoa;
		
		if (tong >= diemChuan) { 
			System.out.println(super.getFullName());
			return true;
		}
		
		return false;
	}
}