package com.company.Trivial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] address = s.next().toCharArray();
        ArrayList<Integer> eyesPositions = new ArrayList<>();

        for(int i = 0; i < address.length; i++){
            char characterAtIndex = address[i];

            if(characterAtIndex == ':' || characterAtIndex == ';'){
                char[] smiley = Arrays.copyOfRange(address, i, i + 3);

                if(isValidSmiley(smiley)){
                    eyesPositions.add(i);
                }
            }
        }

        for(int value : eyesPositions){
            System.out.println(value);
        }
    }

    private static boolean isValidSmiley(char[] chars){
        //First smiley variant :) or ;)
        if((chars[0] == ':' || chars[0] == ';') && chars[1] == ')'){
            return true;
        }

        //Second smiley variant :-) or ;-)
        if((chars[0] == ':' || chars[0] == ';') && chars[1] == '-' && chars[2] == ')'){
            return true;
        }

        return false;
    }
}
