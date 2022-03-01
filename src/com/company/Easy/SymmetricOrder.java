package com.company.Easy;

import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        int counter = 1;
        while(cases != 0){
            String[] words = new String[cases];
            for(int i = 0; i < cases; i++){
                String word = scan.next();
                words[i] = word;
            }

            System.out.println("SET " + counter);
            for(int j = 0; j < words.length; j++){
                if(j % 2 == 0){
                    System.out.println(words[j]);
                }
            }

            for(int k = words.length - 1; k > 0; k--){
                if(k % 2 == 1){
                    System.out.println(words[k]);
                }
            }

            cases = scan.nextInt();
            counter++;
        }
    }
}
