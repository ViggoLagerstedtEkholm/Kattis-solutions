package com.company.Easy;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(), b = scan.nextInt();

        double area = (b * h) / 2.0;
        String s = String.valueOf(area);
        s = !s.contains(".") ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        System.out.print(s);
    }
}
