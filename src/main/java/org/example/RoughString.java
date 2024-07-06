package org.example;

import java.util.Scanner;

public class RoughString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Name ");
        String name = sc.next();
        System.out.print("enter last name ");
        String LastName = sc.next();
        String Fullname = name + "@" + LastName;
        System.out.println("your full name is "+Fullname);
        System.out.println("length of your name is "+Fullname.length());
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
        }
        if(name.compareTo(LastName)== 0){
            System.out.println("its equal");
        }else {
            System.out.println("not equal");
        }
    }
}