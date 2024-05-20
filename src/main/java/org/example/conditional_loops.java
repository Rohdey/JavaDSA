package org.example;


import java.util.*;

public class conditional_loops {
    public static void main(String[]args){
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("enter your age");
//        int age = sc.nextInt();
//        if(age>=18) {
//            System.out.println("Adult");
//        } else{
//            System.out.println("Not Adult ");

//        ##Two print odd or even number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int num = sc.nextInt();
////        int sum = num%2;
//        if(num%2==0){
//            System.out.println("its an even number");
//        } else{
//            System.out.println("its an odd number");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the 1st number");
//        int a = sc.nextInt();
//        System.out.println("enter the 2nd number");
//        int b = sc.nextInt();
//        if(a==b){
//            System.out.println("equal");
//        }
//        else if(a>b){
//            System.out.println("a is greater");
//        } else{
//            System.out.println("a is lesser");
//
//
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the button number");
        int button = sc.nextInt();
        switch(button){
            case 1 :
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");
        }
    }
}
