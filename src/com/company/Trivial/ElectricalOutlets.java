package com.company.Trivial;

import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            int tests = scan.nextInt();

            int[] values = new int[tests];

            for(int j = 0; j < tests; j++){
                int outlets = scan.nextInt();
                values[j] = outlets;
            }

            int outlets = 0;
            for (int value : values) {
                outlets += value - 1;
            }

            System.out.println(outlets + 1);
        }
    }
}
