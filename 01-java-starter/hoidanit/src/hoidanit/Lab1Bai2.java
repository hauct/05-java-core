package hoidanit;

import java.util.Scanner;

public class Lab1Bai2 {
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
