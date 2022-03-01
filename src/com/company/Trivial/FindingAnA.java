package com.company.Trivial;

import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int indexOfWord = word.indexOf('a');
        String wordAfterA = word.substring(indexOfWord);
        System.out.println(wordAfterA);
    }
}
