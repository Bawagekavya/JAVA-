package com.xwork.ex;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "data.txt";

        // Write data from console to file
        System.out.println("Enter data to write to file (type 'exit' to stop):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        // Read data from file and write to console

        System.out.println("Data from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }



}
