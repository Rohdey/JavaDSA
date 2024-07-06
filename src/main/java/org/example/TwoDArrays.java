package org.example;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        sc.nextLine();

        int[][] numbers = new int[row][column];
        // input of rows
        System.out.println("matrix row");

        for (int i = 0; i < row; i++) {
            String rowString = sc.nextLine();
            for (int j = 0; j < column; j++) {
                numbers[i][j] = Character.getNumericValue(rowString.charAt(j));
            }

        }
        System.out.println();
        // output of rows
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
            System.out.flush();
        }
        sc.close();
    }
}
