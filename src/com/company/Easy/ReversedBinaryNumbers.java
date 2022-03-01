package com.company.Easy;

import java.util.*;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String binary = toBinary(number);
        StringBuilder stringBuilder = new StringBuilder(binary);
        stringBuilder.reverse();
        System.out.println(Integer.parseInt(stringBuilder.toString(),2));
    }

    private static String toBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
