package bai2;

import java.util.Scanner;

public class Bai02 {
	public void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.5f ", x);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Nhập các cạnh
		System.out.println("Nhập chiều dài của hình chữ nhật: ");
		int length = scanner.nextInt();
		System.out.println("Nhập chiều rộng của hình chữ nhật: ");
		int width = scanner.nextInt();
		
		// Tính các chỉ số
		int perimeter = (length + width)*2;
		System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
		int acreage = length*width;
		System.out.println("Diện tích của hình chữ nhật là: " + acreage);
		int min_edge = Math.min(length, width);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + min_edge);
		scanner.close();
	}
}
