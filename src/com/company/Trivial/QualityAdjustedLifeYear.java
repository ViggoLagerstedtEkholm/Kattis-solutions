package com.company.Trivial;

import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int periods = scan.nextInt(); //number of periods of constant quality of life during the person’s lifetime.

        double tot = 0.0;

        for(int i = 0; i < periods; i++){
            double quality = scan.nextDouble();
            double numberOfYears = scan.nextDouble();
            double product = quality * numberOfYears;
            tot += product;
        }

        scan.close();
        System.out.printf("%.3f", tot);
    }
}
