/*
 * File: FanTest.java
 * Course: CSD402 Java for Programmers
 * Module: 6.2
 * Date: 9/6/2026
 * Author: William Judd
 *
 * Purpose:
 * Tests the Fan class using both constructors and demonstrates
 * getter, setter, and toString() functionality.
 */

public class FanTest {

    public static void main(String[] args) {

        // First instance uses the no-argument constructor.
        Fan defaultFan = new Fan();

        // Second instance uses the argument constructor.
        Fan customFan = new Fan(Fan.FAST, true, 10, "black");

        System.out.println("INITIAL FAN STATES");
        System.out.println("Default fan: " + defaultFan);
        System.out.println("Custom fan:  " + customFan);

        System.out.println();

        // Demonstrate setter methods on the default fan.
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("blue");

        System.out.println("DEFAULT FAN AFTER SETTER METHODS");
        System.out.println(defaultFan);

        System.out.println();

        // Demonstrate getter methods on the custom fan.
        System.out.println("CUSTOM FAN GETTER VALUES");
        System.out.println("Speed: " + customFan.getSpeed());
        System.out.println("On: " + customFan.isOn());
        System.out.println("Radius: " + customFan.getRadius());
        System.out.println("Color: " + customFan.getColor());
    }
}
