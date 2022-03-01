package com.company.Trivial;

import java.util.Scanner;
import java.util.StringJoiner;

public class Echo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        StringJoiner stringJoiner = new StringJoiner(" ");
        for(int i = 0; i < 3; i++){
            stringJoiner.add(word);
        }

        System.out.println(stringJoiner);
    }
}
