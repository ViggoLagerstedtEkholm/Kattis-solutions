package com.company.Trivial;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();

        int[] array = new int[]{a, b};
        Arrays.sort(array);

        StringJoiner stringJoiner = new StringJoiner(" ");

        for(int value : array){
            stringJoiner.add(String.valueOf(value));
        }

        System.out.println(stringJoiner);
    }
}
