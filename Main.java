package Override;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float diemChuan;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số Thí Sinh: ");
		int n = sc.nextInt();
		
		ThiSinh a[] = new ThiSinh[n];
		System.out.println(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("----");
			System.out.println("Thí Sinh: " + (i + 1));
			a[i] = new ThiSinh();
			a[i].inPut();
		}

		System.out.println(" ");
		System.out.println("Danh sách Thí Sinh vừa nhập là");
		for (int i = 0; i < a.length; i++) {
			System.out.println("----");
			System.out.println("Thí Sinh " + (i + 1));
			a[i].outPut();
		}
		
		System.out.println(" ");
		System.out.println("----");
		
		System.out.print("Bạn hãy nhập điểm chuẩn vào: ");
		diemChuan = sc.nextFloat();
		
		System.out.println("Danh sách các Thí Sinh đã đỗ");
		for (int i = 0; i < a.length; i++) {
			if(a[i].check(diemChuan))
				count ++;
		}
		
		if(count == 0)
			System.out.println("Không có thí sinh nào đỗ!");
	}
}
