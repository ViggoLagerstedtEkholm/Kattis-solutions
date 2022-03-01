package com.company.Easy;

import java.util.Scanner;

public class TransitWoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt(); //s
        int classStartTime = scan.nextInt(); //t
        int bussess = scan.nextInt(); //n

        for(int i = 0; i <= bussess; i++){
            int walk = scan.nextInt(); //d
            time += walk;
        }

        for(int i = 0; i < bussess; i++){
            int ride = scan.nextInt();
            time += ride;
        }

        for(int i = 0; i < bussess; i++){
            int interval = scan.nextInt();
            time += time % interval;
        }

        if(time <= classStartTime){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
