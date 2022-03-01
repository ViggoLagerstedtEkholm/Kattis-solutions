package com.company.Easy;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] moves = scan.next().toCharArray();

        char[] map = new char[3];
        map[0] = 'X';
        map[1] = '0';
        map[2] = '0';

        for(char move : moves){
            switch(move){
                case 'A':
                    swap(map, 0, 1);
                    break;
                case 'B':
                    swap(map, 1, 2);
                    break;
                case 'C':
                    swap(map, 0, 2);
                    break;
            }
        }

        for(int i = 0; i < map.length; i++){
            char characterAtIndex = map[i];

            if(characterAtIndex == 'X'){
                System.out.println(i + 1);
                break;
            }
        }

    }

    public static char[] swap(char[] ch, int a, int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return ch;
    }
}
