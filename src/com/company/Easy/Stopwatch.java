package com.company.Easy;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pressed = scan.nextInt();

        if(pressed % 2 == 1){
            System.out.println("still running");
        }else{
            int total = 0;
            for(int i = 0; i < pressed / 2; i++){
                int start = scan.nextInt();
                int end = scan.nextInt();

                total += end - start;
            }
            System.out.println(total);
        }
    }
}
