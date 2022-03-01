package com.company.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> unique = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            int A = scan.nextInt();
            int mod = A % 42;

            boolean found = false;
            for(int value : unique){
                if (value == mod) {
                    found = true;
                    break;
                }
            }

            if(!found){
                unique.add(mod);
            }
        }

        System.out.println(unique.size());
    }
}
