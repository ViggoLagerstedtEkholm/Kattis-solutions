package com.company.Easy;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    private static final double G = 9.81;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for(int i = 0; i < cases; i++){
            double v0 = scan.nextDouble();
            double theta = Math.toRadians(scan.nextDouble());
            double x1 = scan.nextDouble();
            double h1 = scan.nextDouble();
            double h2 = scan.nextDouble();

            //Get time...
            double t = x1 / (v0 * Math.cos(theta));
            double y = (v0 * t * Math.sin(theta)) - ((G * t * t) / 2);

            if(y >= h1 + 1 && y <= h2 - 1){
                System.out.println("Safe");
            }else{
                System.out.println("Not Safe");
            }
        }
    }
}
