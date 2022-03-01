package com.company.Trivial;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] problems = scan.next().split(";");

        int problemCount = 0;

        for(String problem : problems){
            if(problem.contains("-")){
                String[] parts = problem.split("-");

                int min = parseInt(parts[0]);
                int max = parseInt(parts[1]);

                for(int i = min; i <= max; i++){
                    problemCount++;
                }
            }else{
                problemCount++;
            }
        }
        System.out.println(problemCount);
    }
}
