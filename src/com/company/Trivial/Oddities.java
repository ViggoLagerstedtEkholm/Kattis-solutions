package com.company.Trivial;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        for(int i = 0; i < total; i++) {
            int value = scan.nextInt();

            if (Math.abs(value) % 2 == 1) {
                System.out.println(value + " is odd");
            } else {
                System.out.println(value + " is even");
            }
        }
    }
}
