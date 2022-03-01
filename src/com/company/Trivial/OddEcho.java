package com.company.Trivial;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases  = scan.nextInt();
        ArrayList<String> odd = new ArrayList<>();

        for(int i = 1; i <= cases; i++){
            String word = scan.next();

            if(i % 2 == 1){
                odd.add(word);
            }
        }

        for(String word : odd){
            System.out.println(word);
        }
    }
}
