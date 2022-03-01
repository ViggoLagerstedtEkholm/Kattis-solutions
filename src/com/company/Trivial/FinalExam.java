package com.company.Trivial;

//0.14 s

import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int questions = scanner.nextInt();
        int score = 0;

        String correct = scanner.nextLine();

        for(int i = 0; i < questions; i++){
            String answer = scanner.nextLine();

            if(correct.equals(answer))
            {
                score++;
            }

            correct = answer;
        }

        System.out.println(score);
        scanner.close();
    }
}
