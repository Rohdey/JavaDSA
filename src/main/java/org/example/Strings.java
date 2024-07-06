package org.example;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter first and last names using next()
        System.out.print("Enter first name: ");
        String firstName = sc.next();
        System.out.print("Enter last name: ");
        String lastName = sc.next();

        // Concatenate first and last names with an "@" separator
        String fullName = firstName + "@" + lastName;
        System.out.println("Your full name is: " + fullName);

        // Print the length of the full name
        System.out.println("Length of your name is: " + fullName.length());

        // Print each character of the full name
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // Adding a newline to separate the output sections
        System.out.println();

        // Compare first name with the full name
        System.out.println("Comparing '" + firstName + "' with '" + fullName + "'");
        if (firstName.compareTo(fullName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        //for some reasomns this is not working here i have showed the output in RoughString.java file
        // string 1>String2 => +ve output
//         string 1==String2 => 0
//         string 1<String2 => -ve output

        // Close the scanner
        sc.close();
    }
}

