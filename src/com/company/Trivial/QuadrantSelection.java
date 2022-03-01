package com.company.Trivial;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(), Y = scan.nextInt();

        if(X > 0 && Y > 0){
            System.out.println(1);
        }else if(X < 0 && Y > 0){
            System.out.println(2);
        }else if(X < 0 && Y < 0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}
