/*
 * William Judd
 * CSD 402
 * Module 1.3 Programming Assignment
 * 8/16/2026
 * This program calculates the amount of energy in joules required to heat water from an initial temperature to a final temperature.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Judd_Mod1_3 {

    private static final double SPECIFIC_HEAT_WATER = 4184.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Water Heating Energy Calculator");
        System.out.println("--------------------------------");

        double waterMass = getPositiveNumber(
                input,
                "Enter the amount of water in kilograms: "
        );

        double initialTemperature = getNumber(
                input,
                "Enter the initial temperature in Celsius: "
        );

        double finalTemperature = getNumber(
                input,
                "Enter the final temperature in Celsius: "
        );

        double energy = calculateEnergy(
                waterMass,
                initialTemperature,
                finalTemperature
        );

        System.out.printf(
                "%nThe energy needed is %.2f joules.%n",
                energy
        );

        input.close();
    }

    public static double calculateEnergy(
            double waterMass,
            double initialTemperature,
            double finalTemperature) {

        return waterMass
                * (finalTemperature - initialTemperature)
                * SPECIFIC_HEAT_WATER;
    }

    public static double getNumber(Scanner input, String prompt) {

        while (true) {
            try {
                System.out.print(prompt);
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input. Please enter a numeric value."
                );
                input.nextLine();
            }
        }
    }

    public static double getPositiveNumber(
            Scanner input,
            String prompt) {

        while (true) {
            double value = getNumber(input, prompt);

            if (value > 0) {
                return value;
            }

            System.out.println(
                    "Water mass must be greater than zero."
            );
        }
    }
}