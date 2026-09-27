/*
 * Name: William Judd
 * Date: September 27, 2026
 * Assignment: Module 9.2 Programming Assignment - Program 1
 *
 * This program stores Strings in an ArrayList and displays the collection
 * using a for-each loop. The user enters an element number as a String.
 * The program demonstrates autoboxing and auto-unboxing before attempting
 * to display the selected element using exception handling.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WilliamArrayListException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        // Add at least 10 String elements to the ArrayList.
        items.add("Java");
        items.add("Python");
        items.add("HTML");
        items.add("CSS");
        items.add("JavaScript");
        items.add("Linux");
        items.add("Git");
        items.add("SQL");
        items.add("Networking");
        items.add("Cybersecurity");

        System.out.println("ArrayList Elements:");

        // Number the elements while using the required for-each loop.
        int elementNumber = 1;

        for (String item : items) {
            System.out.println(elementNumber + ". " + item);
            elementNumber++;
        }

        System.out.println();
        System.out.print("Enter the element number you would like to see again (1-10): ");

        // Read the user's selection as a String.
        String userInput = input.nextLine();

        try {
            // Convert the String input to a primitive int.
            int selectedNumber = Integer.parseInt(userInput);

            // Autoboxing converts the primitive int into an Integer object.
            Integer boxedNumber = selectedNumber;

            // Auto-unboxing converts the Integer back to an int.
            int index = boxedNumber - 1;

            // Attempt to display the selected ArrayList element.
            System.out.println("Selected element: " + items.get(index));

        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            // Handle invalid text or an element number outside the ArrayList.
            System.out.println("Exception has been thrown: Out of Bounds");
            System.out.println("Exception: " + e);
        }

        input.close();
    }
}