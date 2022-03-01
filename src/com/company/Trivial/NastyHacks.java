package com.company.Trivial;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        for(int i = 0; i < total; i++) {
            int expectedRevNoAdv = scan.nextInt(), expectedRevAdv = scan.nextInt(), cost = scan.nextInt();
            int profit = expectedRevAdv - cost;
            if(profit > expectedRevNoAdv){
                System.out.println("advertise");
            }else if( profit < expectedRevNoAdv){
                System.out.println("do not advertise");
            }
            else {
                System.out.println("does not matter");
            }
        }
    }
}
