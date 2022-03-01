package com.company.Trivial;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String[] characters = word.split("");

        boolean consequtiveCharacters = false;

        for(int i = 1; i < characters.length; i++){
            String C2 = characters[i];
            String C1 = characters[i - 1];

            if (C1.equals("s") && C2.equals("s")) {
                consequtiveCharacters = true;
                break;
            }
        }

        if(consequtiveCharacters){
            System.out.println("hiss");
        }else{
            System.out.println("no hiss");
        }
    }
}
