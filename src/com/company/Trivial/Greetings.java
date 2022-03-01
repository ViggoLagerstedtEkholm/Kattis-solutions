package com.company.Trivial;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] characters = scan.next().split("");

        int eCounter = 0;
        for(String character : characters){
            if(character.equals("e")) eCounter++;
        }

        String firstCharacter = characters[0];

        String lastCharacter = characters[characters.length - 1];
        String sb = firstCharacter +
                "e".repeat(Math.max(0, eCounter * 2)) +
                lastCharacter;

        System.out.println(sb);
    }
}
