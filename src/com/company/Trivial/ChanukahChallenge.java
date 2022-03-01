package com.company.Trivial;

import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int datasets = scan.nextInt();

        for(int i = 1; i <= datasets; i++){
            int K = scan.nextInt();
            int days = scan.nextInt();

            int candles = 0;
            for(int j = 2; j < days + 2; j++){
                candles += j;
            }
            System.out.println(K + " " + candles);
        }
    }
}
