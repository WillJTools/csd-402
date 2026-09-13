/*
 * Name: William Judd
 * Date: September 13, 2026
 * Assignment: Module 7.2 Programming Assignment
 * Course: CSD402 Java for Programmers
 */

import java.util.ArrayList;

public class UseFans {

    /*
     * Displays all Fan objects in a collection
     * without using the toString() method.
     */
    public static void displayFans(ArrayList<Fan> fans) {

        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    /*
     * Displays one Fan object without using
     * the toString() method.
     */
    public static void displayFan(Fan fan) {

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "black");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8.0, "blue");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        System.out.println("Displaying All Fans");
        System.out.println("-------------------");

        displayFans(fans);

        System.out.println("Displaying One Fan");
        System.out.println("------------------");

        displayFan(fan2);
    }
}