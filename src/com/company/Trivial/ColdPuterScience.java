package com.company.Trivial;

import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = scan.nextInt();

        int counter = 0;
        for(int i = 0; i < points; i++){
            int temp = scan.nextInt();
            if(temp < 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
