/*
 * William Judd
 * CSD 402 - Java for Programmers
 * Module 4.2 Programming Assignment
 * 08/30/2026
 *
 * This program demonstrates method overloading by creating four
 * average methods that accept arrays of different numeric data types.
 * Each method calculates and returns the average of its array.
 *
 * GitHub: https://github.com/WillJTools/csd-402
 */

public class Judd_Mod4_2 {

    public static short average(short[] array) {
        short sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {5.5, 10.5, 15.5, 20.5, 25.5, 30.5};

        System.out.println("SHORT ARRAY");
        System.out.print("Elements: ");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        System.out.println("\nINT ARRAY");
        System.out.print("Elements: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        System.out.println("\nLONG ARRAY");
        System.out.print("Elements: ");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        System.out.println("\nDOUBLE ARRAY");
        System.out.print("Elements: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}