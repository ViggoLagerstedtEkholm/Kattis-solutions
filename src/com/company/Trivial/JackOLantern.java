package com.company.Trivial;

import java.util.Scanner;

public class JackOLantern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eyeDesigns = scan.nextInt(), noseDesigns = scan.nextInt(), mouthDesigns = scan.nextInt();
        System.out.println(eyeDesigns * noseDesigns * mouthDesigns);
    }
}
