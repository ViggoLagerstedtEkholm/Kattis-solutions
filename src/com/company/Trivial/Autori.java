package com.company.Trivial;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.next().split("-");

        StringBuilder sb = new StringBuilder();
        for(String word : words){
            char[] characters = word.toCharArray();

            sb.append(characters[0]);
        }

        System.out.println(sb);
    }
}
