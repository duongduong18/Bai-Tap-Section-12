package Bai1;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("nhap a");
				int a = new Scanner(System.in).nextInt();
				System.out.println("nhap b");
				int b = new Scanner(System.in).nextInt();
//						int tong = a + b ;
						System.out.println("tong " + (a+b));
						break;
			} catch (Exception e) {
				System.out.println("nhap sai .vui long nhap lai");
			}
		}

		
	}
 
}
