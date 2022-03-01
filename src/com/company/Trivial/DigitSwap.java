package com.company.Trivial;

import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        String[] code = String.valueOf(num).split("");
        String digit1 = code[0];
        String digit2 = code[1];

        code[0] = digit2;
        code[1] = digit1;

        System.out.print(code[0] + code[1]);
    }
}
