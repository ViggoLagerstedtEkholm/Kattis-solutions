package com.company.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Apaxiaaaaans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] characters = scan.next().toCharArray();

        int j = 0;

        for(int i = 1; i < characters.length; i++){
            if(characters[i] != characters[j]){
                j++;
                characters[j] = characters[i];
            }
        }

        System.out.println(Arrays.copyOfRange(characters, 0, j + 1));
    }
}
