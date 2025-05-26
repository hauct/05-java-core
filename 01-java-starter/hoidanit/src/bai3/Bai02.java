package bai3;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        System.out.println("Nhập một số nguyên dương: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Bảng của chương của số: " + number + "  là");
        System.out.println("||=========||");
        for (int i = 0; i < 11; i++){
            int result = number * i; 
            System.out.println("|| x X "+ i + "= " + result + " ||");
        }
        scanner.close();
}
}
