package bai9;

import java.util.Scanner;

public class Video52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên x:");
        while (true) {
            int x = scanner.nextInt();
            try {
                System.out.println("Kết quả của 10/x là: " + 10/x);
                scanner.close();
                break;
            } catch (Exception e) {
                System.out.println("run error with x: " + x);
            }
        }
        
    }
}
