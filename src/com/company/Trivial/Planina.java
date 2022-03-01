package com.company.Trivial;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations  = scan.nextInt();
        int sideLength = 2;
        for(int i = 0; i < iterations; i++){
            sideLength = sideLength * 2 - 1;
        }

        System.out.println((int) Math.pow(sideLength, 2));
    }
}
