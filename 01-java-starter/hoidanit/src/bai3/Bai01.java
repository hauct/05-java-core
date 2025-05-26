package bai3;
import java.util.Scanner;

public class Bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nhập một số nguyên dương (nhập 0 để thoát): ");
            
            try {
                int number = Integer.parseInt(scanner.nextLine());
                
                if (number == 0) {
                    System.out.println("Đã thoát chương trình!");
                    break;
                }
                
                if (isPrime(number)) {
                    System.out.println(number + " là số nguyên tố.");
                } else {
                    System.out.println(number + " không phải là số nguyên tố.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
            }
        }
        
        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        
        // Kiểm tra từ 5 đến căn bậc 2 của num
        // Bước nhảy 6 (tối ưu hóa tốc độ)
        int i = 5;
        int sqrtNum = (int) Math.sqrt(num);
        
        while (i <= sqrtNum) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        
        return true;
    }
}