package bai9;

import java.util.Scanner;

public class Video56 {
    Scanner scanner = new Scanner(System.in);
    public static void nhapMasv(){
        System.out.print("Nhập mã sinh viên: ");
        String result = null;
        while (true) {
            try (Scanner scanner  = new Scanner(System.in)) {
            result = scanner.nextLine();
            break;
            }
        catch (Exception e) {
            System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());    
        }
        }
    }
    public static void main(String[] args) {    

    }
}