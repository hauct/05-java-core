package bai6;

import java.util.Scanner;
import bai4.Student;
import java.util.ArrayList;

public class Video38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin của 5 sinh viên");

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Nhập tuổi của sinh viên thứ " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            System.out.println("Nhập mã sinh viên của sinh viên thứ " + (i + 1) + ": ");
            String studentId = scanner.nextLine();

            Student student = new Student(name, age, studentId);
            students.add(student);
        }

        for (Student student : students) {
            if (student.getName().equals("Nguyen")) {
                System.out.println("Sinh viên có tên là Nguyen có thông tin là:");
                // In thêm thông tin nếu muốn
                System.out.println("Tên: " + student.getName() + ", Tuổi: " + student.getAge() + ", Mã SV: " + student.getId());
            }
        }
        scanner.close();
    }
}