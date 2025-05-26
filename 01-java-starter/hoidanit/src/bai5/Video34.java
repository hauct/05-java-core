package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> danhSach = new ArrayList<>();
        
        while(true) {
            System.out.print("Nhập số: ");
            double x = scanner.nextDouble();
            danhSach.add(x);
            
            System.out.print("Nhập thêm Y/N? ");
            scanner.nextLine(); // Clear newline
            String check = scanner.nextLine();
            
            if(check.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        System.out.println("Danh sách vừa nhập: " + danhSach);
        scanner.close();
    }
}