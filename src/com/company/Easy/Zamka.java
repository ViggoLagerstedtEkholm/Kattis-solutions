package com.company.Easy;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt(), max = scan.nextInt(), sum = scan.nextInt();

        for(int i = min; i <= max; i++){
            if(sumOfDigits(i) == sum){
                System.out.println(i);
                break;
            }
        }

        for(int i = max; i >= 0; i--){
            if(sumOfDigits(i) == sum){
                System.out.println(i);
                break;
            }
        }
    }

    private static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0)
        {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
