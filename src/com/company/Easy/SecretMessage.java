package com.company.Easy;

//0.35 s

import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        String[] results = new String[cases];

        for(int i = 0; i < cases; i++){
            StringBuilder word = new StringBuilder(scan.next());

            int wordLength = word.length();
            int nextPerfectSquare = nextPerfectSquared(wordLength);

            int padding = nextPerfectSquare - wordLength;

            word.append("*".repeat(Math.max(0, padding)));

            char[][] matrix = getCharMatrix(word.toString());
            matrix = rotate(matrix);
            String encrypted = getEncrypted(matrix);
            results[i] = encrypted;
        }

        for(String result : results){
            System.out.println(result);
        }
    }

    private static char[][] getCharMatrix(String word){
        int rows = (int) Math.sqrt(word.length());
        int columns = (int) Math.sqrt(word.length());

        char[][] charMatrix = new char[rows][columns];

        //Run to height of 2D matrix.
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++ ){
                String segment = word.substring(row * columns, row * columns + columns);
                char[] characters = segment.toCharArray();
                charMatrix[row][column] = characters[column];
            }
        }

        return charMatrix;
    }

    private static char[][] rotate(char[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        char[][] ret = new char[rows][columns];

        for (int i = 0; i < columns; ++i){
            for (int j = 0; j < columns; ++j){
                ret[i][j] = matrix[columns - j - 1][i];
            }
        }

        return ret;
    }

    private static int nextPerfectSquared(int wordLength){
        int m = (int) Math.ceil(Math.sqrt(wordLength));
        return (int) Math.pow(m, 2);
    }

    private static String getEncrypted(char[][] map){
        StringBuilder stringBuilder = new StringBuilder();

        //Run to height of 2D matrix.
        for(int row = 0; row < map.length; row++){
            for(int column = 0; column < map[0].length; column++){
                char character = map[row][column];

                if(character != '*'){
                    stringBuilder.append(character);
                }
            }
        }

        return stringBuilder.toString();
    }
}
