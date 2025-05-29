package bai9;

import java.util.Scanner;

public class Video53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        try {
            System.out.println("run try with x: " + x);
        } catch (Exception e) {
            System.out.println("run error with x: " + x);
        } finally {
            System.out.println("Kết thúc chương trình");
        }
        scanner.close();
    }
}
