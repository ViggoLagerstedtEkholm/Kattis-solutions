package com.company.Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortOfSorting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        boolean exit = false;

        while(!exit){
            int cases = scan.nextInt();

            if(cases == 0){
                exit = true;
            }

            for(int i = 1; i <= cases; i++){
                String name = scan.next();
                inputs.add(name);
            }

            inputs = (ArrayList<String>) inputs.stream().sorted(Comparator.comparing(e -> e.substring(0,2))).collect(Collectors.toList());

            for(String value : inputs){
                System.out.println(value);
            }
            inputs.clear();
        }
    }
}
