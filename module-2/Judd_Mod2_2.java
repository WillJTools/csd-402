/*
 * Name: William Judd
 * Course: CSD402-300H Java for Programmers
 * Assignment: Module 2.2 Programming Assignment
 * Date: August 23, 2026
 * Purpose: Simulate a Rock-Paper-Scissors game between the user and computer.
 */

import java.util.Random;
import java.util.Scanner;

public class Judd_Mod2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid selection. Please run the program again and enter 1, 2, or 3.");
            input.close();
            return;
        }

        int userChoice = input.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please run the program again and enter 1, 2, or 3.");
            input.close();
            return;
        }

        String computerSelection = choiceToString(computerChoice);
        String userSelection = choiceToString(userChoice);

        System.out.println();
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);

        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }

    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}