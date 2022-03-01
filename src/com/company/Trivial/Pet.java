package com.company.Trivial;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int highestPointsPerson = 1;

        for(int ratingIndex = 1; ratingIndex <= 5; ratingIndex++){
            int vote1  = scan.nextInt(), vote2 = scan.nextInt(), vote3 = scan.nextInt(), vote4 = scan.nextInt();
            int sum = vote1 + vote2 + vote3 + vote4;

            if(sum > max){
                max = sum;
                highestPointsPerson = ratingIndex;
            }
        }

        System.out.println(highestPointsPerson + " " + max);
    }
}
