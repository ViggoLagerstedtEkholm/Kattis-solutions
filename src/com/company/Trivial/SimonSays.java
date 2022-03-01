package com.company.Trivial;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for(int i = 1; i <= cases + 1; i++){
            String command = scan.nextLine();

            if(command.startsWith("Simon says")){
                String doCommand = command.substring("Simon says ".length());
                System.out.println(doCommand);
            }
        }
    }
}
