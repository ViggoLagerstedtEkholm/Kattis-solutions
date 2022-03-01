package com.company.Trivial;

import java.util.Scanner;

public class Bela {
    private static final int[] dominant = {0, 0, 14, 10, 20, 3, 4, 11};
    private static final int[] notDominant = {0, 0, 0, 10, 2, 3, 4, 11};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        String dominantSuit = scanner.next();

        int score = 0;
        for(int i = 0; i < cases * 4; i++){
            char[] cardParts = scanner.next().toCharArray();
            char number = cardParts[0];
            char suit = cardParts[1];

            int indexOfCard = getCardIndexPosition(number);
            if(String.valueOf(suit).equals(dominantSuit)){
                score += dominant[indexOfCard];
            }else{
                score += notDominant[indexOfCard];
            }
        }

        System.out.println(score);
    }

    private static int getCardIndexPosition(char index){
        switch (index) {
            case '7': return 0;
            case '8': return 1;
            case '9': return 2;
            case 'T': return 3;
            case 'J': return 4;
            case 'Q': return 5;
            case 'K': return 6;
            case 'A': return 7;
            default: return -1; //Should not reach if the input it valid...
        }
    }
}
