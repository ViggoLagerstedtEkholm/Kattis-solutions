package com.company.Medium;

// 0.10 s

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = scanner.nextInt();

        HashMap<Integer, Integer> rollFreq = new HashMap<>();
        int[] rolls = new int[groups];

        for(int i = 0; i < groups; i++){
            rolls[i] = scanner.nextInt();
        }

        for (int j : rolls) {
            rollFreq.putIfAbsent(j, 0);
            rollFreq.put(j, rollFreq.get(j) + 1);
        }

        int max = -1;
        for(Integer roll : rollFreq.keySet()){
            int frequency = rollFreq.get(roll);
            if(frequency == 1){
                if(roll > max){
                    max = roll;
                }
            }
        }

        if(max == -1){
            System.out.println("none");
        }else{
            for(int m = 0; m < rolls.length; m++){
                if(rolls[m] == max){
                    System.out.println(m + 1);
                    break;
                }
            }
        }
    }
}
