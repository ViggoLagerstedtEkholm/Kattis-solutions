package com.company.Trivial;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), D = scan.nextInt(), E = scan.nextInt();

        int score = scan.nextInt();

        if(score >= A){
            System.out.println("A");
        }else if(score >= B){
            System.out.println("B");
        }else if(score >= C){
            System.out.println("C");
        }else if(score >= D){
            System.out.println("D");
        } else if(score >= E){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
