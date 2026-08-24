/*
 * Name: William Judd
 * Course: CSD402-300H Java for Programmers
 * Assignment: Module 3.2 Programming Assignment
 * Date: August 23, 2026
 * Purpose: Use nested for loops to display a seven-row powers-of-two pattern.
 */

public class Judd_Mod3_2 {

    public static void main(String[] args) {

        for (int row = 0; row <= 6; row++) {

            // Leading spaces create the pyramid shape.
            for (int space = 0; space < (6 - row) * 2; space++) {
                System.out.print(" ");
            }

            // Increasing powers of two.
            for (int exponent = 0; exponent <= row; exponent++) {
                System.out.print((1 << exponent) + " ");
            }

            // Decreasing powers of two.
            for (int exponent = row - 1; exponent >= 0; exponent--) {
                System.out.print((1 << exponent) + " ");
            }

            /*
             * Add enough trailing spaces to keep the @ symbols
             * aligned even when values become two digits.
             */
            int numberCharacters = 0;

            for (int exponent = 0; exponent <= row; exponent++) {
                numberCharacters += String.valueOf(1 << exponent).length() + 1;
            }

            for (int exponent = row - 1; exponent >= 0; exponent--) {
                numberCharacters += String.valueOf(1 << exponent).length() + 1;
            }

            int leadingSpaces = (6 - row) * 2;
            int spacesBeforeAt = 42 - leadingSpaces - numberCharacters;

            for (int space = 0; space < spacesBeforeAt; space++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}