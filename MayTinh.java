package Override;

import java.util.Scanner;

public class MayTinh extends May {
	
	private String tocDo;
	private String ram;
	private String hdd;

	public void inPut() {
		super.inPut();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tốc độ: ");
		tocDo = sc.nextLine();
		System.out.print("Nhập dung lượng RAM: ");
		ram = sc.nextLine();
		System.out.print("Nhập dung lượng ổ cứng HDD: ");
		hdd = sc.nextLine();
	}

	public void outPut() {
		super.outPut();
		System.out.println("Tốc độ: " + tocDo);
		System.out.println("Dung lượng RAM: " + ram);
		System.out.println("Dung lượng ổ cúng HDD: " + hdd);
	}
}
