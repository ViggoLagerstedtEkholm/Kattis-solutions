package com.company.Trivial;

import java.util.Scanner;

public class EyeOfSauron {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] towerParts = scan.next().toCharArray();

        int beforeEye = 0;
        int afterEye = 0;
        boolean validEye = false;
        int index = 0;
        for (int i = 0; i < towerParts.length; i++) {
            if (towerParts[i] == '(' && towerParts[i + 1]  == ')' || towerParts[i] == ')' && towerParts[i - 1]  == '('){
                validEye = true;
            }else{
                if(!validEye){
                    beforeEye++;
                }else{
                    afterEye++;
                }
            }
        }
        if(beforeEye == afterEye && validEye){
            System.out.println("correct");
        }else{
            System.out.println("fix");
        }
    }
}
