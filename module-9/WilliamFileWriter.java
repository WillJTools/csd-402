/*
 * Name: William Judd
 * Date: September 27, 2026
 * Assignment: Module 9.2 Programming Assignment - Program 2
 *
 * This program creates a file named data.file if it does not already
 * exist. It writes 10 randomly generated integers to the file or appends
 * 10 more integers if the file already exists. The file is then closed,
 * reopened, read, and its contents are displayed.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WilliamFileWriter {

    public static void main(String[] args) {

        File dataFile = new File("data.file");
        Random random = new Random();

        try {
            // Create data.file if it does not already exist.
            if (dataFile.createNewFile()) {
                System.out.println("data.file was created.");
            } else {
                System.out.println("data.file already exists. New numbers will be appended.");
            }

            // Append mode preserves existing numbers when the file already exists.
            FileWriter writer = new FileWriter(dataFile, true);

            // Generate and write 10 random integers separated by spaces.
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }

            // Closing the writer completes the write operation.
            writer.close();

            System.out.println("10 random numbers were written to data.file.");

            // Reopen the file and display all of its contents.
            Scanner fileReader = new Scanner(dataFile);

            System.out.println();
            System.out.println("Contents of data.file:");

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }

            System.out.println();
            fileReader.close();

        } catch (IOException e) {
            // Display any file-related exception in the console.
            System.out.println("An exception occurred while working with data.file.");
            System.out.println("Exception: " + e);
        }
    }
}
