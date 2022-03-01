package com.company.Trivial;

import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople = s.nextInt(), hufflePuff = s.nextInt();

        String[] names = new String[numberOfPeople];

        for(int i = 0; i < numberOfPeople; i++){
            String name = s.next();
            names[i] = name;
        }

        System.out.println(hufflePuff);
    }
}
