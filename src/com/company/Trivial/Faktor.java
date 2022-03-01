package com.company.Trivial;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int articles = scan.nextInt(), factor = scan.nextInt();
        int bribed = articles * (factor - 1) + 1;
        System.out.println(bribed);
    }
}
