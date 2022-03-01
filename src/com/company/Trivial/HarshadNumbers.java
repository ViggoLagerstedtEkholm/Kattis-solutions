package com.company.Trivial;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(true){
            if(isHarshad(num)){
                break;
            }else{
                num++;
            }
        }

        System.out.println(num);
    }

    private static boolean isHarshad(int number){
        String[] numbers = String.valueOf(number).split("");

        int sumOfDigits = 0;
        for(int i = 0; i < numbers.length; i++){
            sumOfDigits += parseInt(numbers[i]);
        }

        return number % sumOfDigits == 0;
    }
}
