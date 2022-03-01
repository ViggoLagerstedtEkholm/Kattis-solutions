package com.company.Trivial;

import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int GCVWR = scan.nextInt(); //lbs
        int truck = scan.nextInt(); //lbs
        int items = scan.nextInt(); //lbs

        int itemWeight = 0;
        for(int i = 0; i < items; i++){
            int weight = scan.nextInt(); //lbs
            itemWeight += weight;
        }

        int withTruck = GCVWR - truck;
        double limit = withTruck * 0.9 - itemWeight;
        System.out.println((int)limit);
    }
}
