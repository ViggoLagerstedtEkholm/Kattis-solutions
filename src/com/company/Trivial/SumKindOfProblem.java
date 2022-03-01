package com.company.Trivial;

// 0.43 s

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for(int i = 1; i <= cases; i++){
            int K = scanner.nextInt(), N = scanner.nextInt();

            int S1 = (int) (Math.pow(N, 2) + N) / 2;
            int S2 = (int) Math.pow(N, 2);
            int S3 = (int) Math.pow(N, 2) + N;
            System.out.println(K + " " + S1 + " " + S2 + " " + S3);
        }
    }
}
