package com.company.Easy;

//0.97 s

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        int[] values = new int[cases];
        for(int i = 0; i < cases; i++){
            values[i] = scanner.nextInt();
        }

        for(int i = values.length - 1; i >= 0; i--){
            System.out.println(values[i]);
        }
    }
}
