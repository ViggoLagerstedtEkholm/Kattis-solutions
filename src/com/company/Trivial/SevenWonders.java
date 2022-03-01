package com.company.Trivial;

import java.util.HashMap;
import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characters = scanner.next().toCharArray();

        //Card -> Frequency
        HashMap<Character, Integer> hand = new HashMap<>();

        for(char character : characters){
            hand.putIfAbsent(character, 0);
            hand.put(character, hand.get(character) + 1);
        }

        int bonus = 0;
        if(hand.size() == 3){
            bonus += 7;
        }

        int CCount = hand.getOrDefault('C', 0);
        int TCount = hand.getOrDefault('T', 0);
        int GCount = hand.getOrDefault('G', 0);

        int[] counts = new int[3];
        counts[0] = CCount;
        counts[1] = TCount;
        counts[2] = GCount;

        int min = counts[0];
        for(int i = 0; i < counts.length; i++){
            if(counts[i] < min){
                min = counts[i];
            }
        }

        int total = CCount * CCount + TCount * TCount + GCount * GCount + (bonus * min);
        System.out.println(total);
    }
}
