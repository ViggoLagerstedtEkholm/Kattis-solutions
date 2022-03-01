package com.company.Trivial;

import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        int min = Math.min(N, M);
        int max = Math.max(N, M);

        for(int i = min + 1; i <= max + 1; i++){
            System.out.println(i);
        }
    }
}
