package Override;

import java.util.Scanner;

public class Nguoi {
	private String fullName;
	private String sex;
	private String birthday;
	private String hometown;
	private String add;

	public Nguoi() {
		
	}
	
	public Nguoi(String fullName, String sex, String birthday, String hometown, String add) {
		this.fullName = fullName;
		this.sex = sex;
		this.birthday = birthday;
		this.hometown = hometown;
		this.add = add;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	public void inPut() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		fullName = sc.nextLine();
		System.out.print("Nhập giới tính: ");
		sex = sc.nextLine();
		System.out.print("Nhập ngày sinh: ");
		birthday = sc.nextLine();
		System.out.print("Nhập quê quán: ");
		hometown = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		add = sc.nextLine();
	}
	
	public void outPut() {
		System.out.println("Họ tên: " + fullName);
		System.out.println("Giới tính: " + sex);
		System.out.println("Ngày sinh: " + birthday);
		System.out.println("Quê quán: " + hometown);
		System.out.println("Địa chỉ: " + add);
	}
}
