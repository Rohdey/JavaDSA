package org.example;

import java.util.Scanner;

public class FunctionsQUESTIONS {
//Q1 AVERAGE OF THREE NUMBERS
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the three numbers ");
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();
//        float average = a+b+c/3;
//        System.out.println("the three numbers average is "+average);
//
//
//    }
    //Q2 sum of all odd numbers from 1 to n
    public static void Printsum(int n){
        int sum =0;
        for (int i = 1; i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }



            }
         System.out.println(sum);

        }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printsum(n);
    }
}
