package com.company.Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        BigInteger sum = a.add(b);
        System.out.println(sum);
    }
}
