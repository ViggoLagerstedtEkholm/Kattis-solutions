package com.company.Easy;

//0.15 s

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class Simone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int colors = scan.nextInt();

        //Map containing (key) and (frequency)
        HashMap<Integer, Integer> colorMap = new HashMap<>();

        for(int i = 1; i <= colors; i++){
            colorMap.putIfAbsent(i, 0);
        }

        for(int i = 1; i <= cases; i++){
            int color = scan.nextInt();
            int colorCount = colorMap.get(color) + 1;
            colorMap.put(color, colorCount);
        }

        int min = colorMap.get(1);
        for (Integer key : colorMap.keySet()) {
            int value = colorMap.get(key);
            if(value < min){
                min = value;
            }
        }

        ArrayList<Integer> lowKeys = new ArrayList<>();
        for (Integer key : colorMap.keySet()) {
            int value = colorMap.get(key);
            if(value == min){
                lowKeys.add(key);
            }
        }

        StringJoiner stringJoiner = new StringJoiner(" ");
        for (Integer key : lowKeys) {
            stringJoiner.add(String.valueOf(key));
        }

        System.out.println(lowKeys.size());
        System.out.println(stringJoiner);
    }
}
