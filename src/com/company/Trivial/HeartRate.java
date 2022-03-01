package com.company.Trivial;

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i < num; i++){
            int b = scan.nextInt();
            double p = scan.nextDouble();

            double BPM = 60.0 * b / p;
            double ABPM = 60.0 / p;

            double BPM_MIN = BPM - ABPM;
            double BPM_MAX = BPM + ABPM;


            System.out.printf("%.4f %.4f %.4f\n", BPM_MIN, BPM, BPM_MAX);
        }
    }
}
