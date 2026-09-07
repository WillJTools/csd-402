/*
 * File: JuddMod5.java
 * Course: CSD402 Java for Programmers
 * Module: 5.2
 * Author: William Judd
 *
 * Purpose:
 * Demonstrates overloaded methods that locate the largest and smallest
 * elements in two-dimensional int and double arrays. Each method returns
 * a one-dimensional int array containing the row and column indexes.
 */
public class JuddMod5 {

    /**
     * Locates the largest value in a two-dimensional double array.
     *
     * @param arrayParam the double array to search
     * @return an int array containing {row, column}
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Locates the largest value in a two-dimensional int array.
     *
     * @param arrayParam the int array to search
     * @return an int array containing {row, column}
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Locates the smallest value in a two-dimensional double array.
     *
     * @param arrayParam the double array to search
     * @return an int array containing {row, column}
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Locates the smallest value in a two-dimensional int array.
     *
     * @param arrayParam the int array to search
     * @return an int array containing {row, column}
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        double[][] doubleArray = {
            {4.5, 2.1, 9.8},
            {7.3, 12.6, 1.4},
            {5.9, 8.2, 3.7}
        };

        int[][] intArray = {
            {14, 7, 22},
            {3, 18, 11},
            {9, 27, 5}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("DOUBLE ARRAY");
        System.out.println("Largest value: " +
            doubleArray[largestDouble[0]][largestDouble[1]] +
            " at row " + largestDouble[0] +
            ", column " + largestDouble[1]);

        System.out.println("Smallest value: " +
            doubleArray[smallestDouble[0]][smallestDouble[1]] +
            " at row " + smallestDouble[0] +
            ", column " + smallestDouble[1]);

        System.out.println();

        System.out.println("INT ARRAY");
        System.out.println("Largest value: " +
            intArray[largestInt[0]][largestInt[1]] +
            " at row " + largestInt[0] +
            ", column " + largestInt[1]);

        System.out.println("Smallest value: " +
            intArray[smallestInt[0]][smallestInt[1]] +
            " at row " + smallestInt[0] +
            ", column " + smallestInt[1]);
    }
}