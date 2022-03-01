package com.company.Trivial;

import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        int sum = 1 - total;
        for(int i = 0; i < total; i++) {
            sum += scan.nextInt();
        }

        System.out.println(sum);
    }
}
