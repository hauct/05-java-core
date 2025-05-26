package bai5;

import java.util.ArrayList;

public class Video33 {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> al = new ArrayList(); // generic

        al.add("Hội Dân IT");
        al.add("Hội Dân IT2");
        al.add("Hội Dân IT3");

        al.remove(1);
        System.out.println(al.toString() + " " + al.get(1));
    }
}