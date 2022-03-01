package com.company.Trivial;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double costOfSeedPerSquareMetre = scan.nextDouble();
        int numberOfLawns = scan.nextInt();

        double totalArea = 0;
        for(int i = 0; i < numberOfLawns; i++){
            double width = scan.nextDouble(), height = scan.nextDouble();
            totalArea += width * height;
        }

        double totalCost = totalArea * costOfSeedPerSquareMetre;
        System.out.printf("%.8f", totalCost);
    }
}
