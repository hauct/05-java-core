package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        System.out.println("Mảng có số lượng phần tử là: ");
        Scanner scanner = new Scanner(System.in);
        int numberElement = scanner.nextInt();
        int[] array = new int [numberElement];
        for (int i = 0; i < numberElement; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng trên là: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Mảng trên với thứ tự từ bé đến lớn là: " + Arrays.toString(array));
        System.out.println("Phần tử bé nhất là: " + array[0]);
        System.out.println("Phần tử lớn nhất là: " + array[array.length - 1]);

        scanner.close();
}
}
