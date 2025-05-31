package bai9;

import java.util.Scanner;

public class Video56 {
    public static int nhapMasv(){
        int result;
        Scanner scanner  = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập mã sinh viên: ");
            try {
            result = scanner.nextInt();
            break;
            }
        catch (Exception e) {
            System.out.println("Mã số sv không hợp lệ, nhập vào số nguyên");
            scanner.next();        }
        }
        scanner.close();
        return result;

    }
    public static void main(String[] args) {
        System.out.println("run video 56");
        try (Scanner scanner  = new Scanner(System.in)) {
            int masv = nhapMasv();
            SinhVien sv = new SinhVien(masv, "HoidanIT", 6.0, 25);
            System.out.println("Mã số sv = " + sv);
        }
    }
}