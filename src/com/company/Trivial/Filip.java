package com.company.Trivial;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Filip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seq1 = scan.nextInt();
        int seq2 = scan.nextInt();

        StringBuilder sb1 = new StringBuilder(String.valueOf(seq1));
        StringBuilder sb2 = new StringBuilder(String.valueOf(seq2));
        sb1.reverse();
        sb2.reverse();

        int seq1Reversed = parseInt(sb1.toString());
        int seq2Reversed = parseInt(sb2.toString());

        if(seq1Reversed > seq2Reversed){
            System.out.println(seq1Reversed);
        }else{
            System.out.println(seq2Reversed);
        }
    }
}
