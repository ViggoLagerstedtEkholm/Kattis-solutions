package com.company.Trivial;

import java.util.Scanner;

public class StuckInTimeLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magicCount = scan.nextInt();

        for(int i = 1; i <= magicCount; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
