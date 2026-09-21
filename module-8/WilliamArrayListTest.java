/*
 * Name: William Judd
 * Date: September 20, 2026
 * Assignment: Module 8.2 Programming Assignment
 *
 * This program stores user-entered integers in an ArrayList
 * and finds the largest value entered.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WilliamArrayListTest {

    // Returns the largest Integer in the ArrayList.
    // An empty list returns 0 as required by the assignment.
    public static Integer max(ArrayList list) {

        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Start with the first value and compare it to the remaining values.
        Integer largest = (Integer) list.get(0);

        for (Object value : list) {
            Integer number = (Integer) value;

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers one at a time.");
        System.out.println("Enter 0 when you are finished.");

        // Continue collecting integers until the user enters 0.
        while (true) {

            System.out.print("Enter an integer: ");

            if (input.hasNextInt()) {

                int number = input.nextInt();

                // Add the number before checking for 0 so 0 is included.
                numbers.add(number);

                if (number == 0) {
                    break;
                }

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }

        // Display the values entered and the largest value found.
        System.out.println();
        System.out.println("Numbers entered: " + numbers);
        System.out.println("Largest value: " + max(numbers));

        // Test the required behavior for an empty ArrayList.
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty ArrayList test: " + max(emptyList));

        input.close();
    }
}