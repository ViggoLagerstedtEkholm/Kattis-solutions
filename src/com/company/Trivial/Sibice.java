package com.company.Trivial;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matches = scan.nextInt(), width = scan.nextInt(), height = scan.nextInt();

        double maximumLength = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        for(int i = 0; i < matches; i++){
            int matchLength = scan.nextInt();

            if(matchLength > maximumLength){
                System.out.println("NE");
            }else{
                System.out.println("DA");
            }
        }
    }
}
