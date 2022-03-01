package com.company.Trivial;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int addends  = scan.nextInt();

        int total = 0;
        for(int i = 0; i < addends; i++){
            int value  = scan.nextInt();
            int power = value % 10;
            int num = value / 10;

            total += Math.pow(num, power);
        }

        System.out.println(total);
    }
}
