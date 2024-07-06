package org.example;

import java.util.Scanner;

public class QuestionForTwoDArray {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Read the number of rows and columns
                int row = sc.nextInt();
                int column = sc.nextInt();

                // Consume the remaining newline character
                sc.nextLine();

                // Initialize the 2D array
                int[][] numbers = new int[row][column];

                // Read each row of the matrix
                for (int i = 0; i < row; i++) {
                    String rowString = sc.nextLine();
                    String[] rowValues = rowString.split(" ");
                    for (int j = 0; j < column; j++) {
                        numbers[i][j] = Integer.parseInt(rowValues[j]);
                    }
                }

                // Read the value to search for
                int x = sc.nextInt();

                // Search for the value x in the 2D array
                boolean found = false; // Variable to track if x is found
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        if (numbers[i][j] == x) {
                            System.out.println("x found at location (" + i + "," + j + ")");
                            found = true; // Set found to true if x is found
                        }
                    }
                }

                if (!found) { // If x is not found, print a message
                    System.out.println("x not found in the array");
                }

                sc.close();
            }
        }
