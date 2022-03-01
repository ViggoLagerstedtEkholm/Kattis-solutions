package com.company.Trivial;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= cases; i++){
            boolean[] present = new boolean[26];
            ArrayList<Character> notPresent = new ArrayList<>();
            String word = scanner.nextLine();

            for(int j = 0; j < word.length(); j++){
                if ('A' <= word.charAt(j) && word.charAt(j) <= 'Z'){
                    present[word.charAt(j) - 'A'] = true;
                }else if ('a' <= word.charAt(j) && word.charAt(j) <= 'z') {
                    present[word.charAt(j) - 'a'] = true;
                }
            }

            for(int k = 0; k < 26; k++)
            {
                if (!present[k]){
                    notPresent.add((char)(k + 'a'));
                }
            }

            if(notPresent.size() == 0){
                System.out.println("pangram");
            }else{
                System.out.print("missing ");
                for(Character character : notPresent){
                    System.out.print(character.toString());
                }
                System.out.println();
            }
        }
    }
}
