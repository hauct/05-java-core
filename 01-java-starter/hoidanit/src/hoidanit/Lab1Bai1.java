package hoidanit;

import java.util.Scanner;


public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Điểm: ");
		String grade = scanner.nextLine();
		System.out.println(name + " có điểm: " + grade);
		scanner.close();
	}
}
