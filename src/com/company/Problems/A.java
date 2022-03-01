package com.company.Problems;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for(int i = 0; i < cases; i++){
            String estimatedCost = String.valueOf(scanner.nextBigInteger());
            int length = estimatedCost.length();
            System.out.println(length);
        }
    }
}
