package Override;

import java.util.Scanner;

public class MainM {
	
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Nhập số máy tính: ");
		int n = sc.nextInt();

		MayTinh a[] = new MayTinh[n];

		System.out.println(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("-----");
			System.out.println("Máy số: " + (i + 1));
			a[i] = new MayTinh();
			a[i].inPut();
		}
		
		System.out.println(" ");
//		System.out.println("----");
		
		May m = new May();
		
		int k;
		boolean flag = true;
		// sử dụng switch case để tạo menu cho chương trình
		do {
			System.out.println("----");
			System.out.println("Bạn chọn làm gì!!!");
			System.out.println("1. In ra thông tin của các máy tính của nhà sản xuất IBM.");
			System.out.println("2. Sắp xếp danh sách các máy tính theo chiều tăng dần của giá thành và in danh sách đã sắp ra màn hình");
			System.out.println("3. Xóa mọi máy tính của hãng Intel sản xuất và in danh sách kết quả ra màn hình.");
			System.out.println("Nhập số khác để thoát!");
			k = sc.nextInt();
			switch (k) {
			case 1:
				try {					
					for (int i = 0; i < a.length; i++) {
						if(m.getnSX().contains("IBM"))
							a[i].outPut();
					}
				} catch (Exception e) {
					System.err.println("Câu này bị sai rồi!!!");
				}
				break;
				
			case 2:
				System.out.print("---");

				break;
			case 3:
				
				break;
				
			default:
				System.err.println("_____________Chương trình đã thoát______________");
				System.err.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi!!!!!");
				flag = false;
				break;
			}
		} while (flag);

	}

}
