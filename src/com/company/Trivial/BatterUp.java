package com.company.Trivial;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        int count = 0;
        int sum = 0;
        for(int i = 0; i < cases; i++){
            int scenario = scanner.nextInt();

            if(scenario != -1){
                sum += scenario;
                count++;
            }

        }
        double result = (double) sum / count;
        System.out.println(result);
    }
}
