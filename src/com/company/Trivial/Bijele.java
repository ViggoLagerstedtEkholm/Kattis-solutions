package com.company.Trivial;

import java.util.Scanner;
import java.util.StringJoiner;

public class Bijele {
    public static void main(String[] args) {
        int validKings = 1, validQueens = 1, validRooks = 2, validBishops = 2, validKnights = 2, validPawns = 8;
        Scanner scan = new Scanner(System.in);
        int validKingsInput = scan.nextInt(),
                validQueensInput = scan.nextInt(),
                validRooksInput = scan.nextInt(),
                validBishopsInput = scan.nextInt(),
                validKnightsInput = scan.nextInt(),
                validPawnsInput = scan.nextInt();

        int kingDiff = validKings - validKingsInput;
        int queenDiff = validQueens - validQueensInput;
        int rookDiff = validRooks - validRooksInput;
        int bishopDiff = validBishops - validBishopsInput;
        int knightsDiff = validKnights - validKnightsInput;
        int pawnsDiff = validPawns - validPawnsInput;

        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(String.valueOf(kingDiff));
        stringJoiner.add(String.valueOf(queenDiff));
        stringJoiner.add(String.valueOf(rookDiff));
        stringJoiner.add(String.valueOf(bishopDiff));
        stringJoiner.add(String.valueOf(knightsDiff));
        stringJoiner.add(String.valueOf(pawnsDiff));

        System.out.println(stringJoiner);
    }
}
