package com.company.Trivial;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner megabytesScanner = new Scanner(System.in); // 1 <= X <= 100 (megabytes per month)
        int mBytesAvailable = megabytesScanner.nextInt();
        int months = megabytesScanner.nextInt();

        int[] megabytesPerMonths = new int[months];

        int notUsed = mBytesAvailable;
        for(int i = 0; i < megabytesPerMonths.length; i++){
            int used = megabytesScanner.nextInt();
            notUsed += mBytesAvailable - used;
            megabytesPerMonths[i] = used;
        }

        System.out.println(notUsed);

        megabytesScanner.close();
    }
}
