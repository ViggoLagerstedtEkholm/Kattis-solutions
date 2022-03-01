package com.company.Trivial;

import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();

        String prefix = number.substring(0, 3);
        if(prefix.equals("555")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
