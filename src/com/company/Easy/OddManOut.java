package com.company.Easy;

//0.30 s

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for(int i = 1; i <= cases; i++){
            HashMap<Integer, Integer> invitationMap = new HashMap<>();

            int guests = scan.nextInt();

            for(int j = 0; j < guests; j++){
                int id = scan.nextInt();
                invitationMap.putIfAbsent(id, 0);
                invitationMap.put(id, invitationMap.get(id) + 1);
            }

            for(Integer key : invitationMap.keySet()){
                int frequency = invitationMap.get(key);
                if(frequency == 1){
                    System.out.println("Case #" + i + ": " + key);
                }
            }
        }
    }
}
