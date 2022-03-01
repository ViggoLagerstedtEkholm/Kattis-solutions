package com.company.Trivial;

import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char[] characters = word.toCharArray();
        Arrays.sort(characters);

        boolean hasDuplicates = false;
        for(int i = 1; i < characters.length - 1; i++){
            char X2 = characters[i];
            char X1 = characters[i - 1];

            if (X1 == X2) {
                hasDuplicates = true;
                break;
            }
        }

        if(hasDuplicates){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
