package Override;

import java.util.Scanner;

public class May {
	private String nSX;
	private String diaChi;
	private String nhanHieu;
	private float giaThanh;

	public May() {

	}

	public May(String nSX, String diaChi, String nhanHieu, float giaThanh) {
		super();
		this.nSX = nSX;
		this.diaChi = diaChi;
		this.nhanHieu = nhanHieu;
		this.giaThanh = giaThanh;
	}

	public String getnSX() {
		return nSX;
	}

	public void setnSX(String nSX) {
		this.nSX = nSX;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}

	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên NSX: ");
		nSX = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.print("Nhập nhãn hiệu: ");
		nhanHieu = sc.nextLine();
		System.out.print("Nhập giá thành: ");
		giaThanh = sc.nextFloat();
	}
	
	public void outPut() {
		System.out.println("Tên NSX: " + nSX);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Nhãn hiệu: " + nhanHieu);
		System.out.println("Giá thành: " + giaThanh);
	}
}


