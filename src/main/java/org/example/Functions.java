package org.example;
import java.util.*;
public class Functions {
    //question 1
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main (String [] args ){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name);
//
//    }


//question2  // SUM OF TWO NUMBERS


//    public static int calculateSum(int a, int b) {
//        return a + b;
//
//    }

//        public static void main( String [] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter first number ");
//            int a = sc.nextInt();
//            System.out.println("enter second number ");
//            int b = sc.nextInt();
//            int sum = calculateSum(a,b);
//                System.out.println("the sum of two number is "+sum);


            //Question 3 // multiply 2 numbers return the product

//            public static int calculateProduct(int a, int b) {
//                return a * b;
//            }
//            public static void main(String [] args) {
//                    Scanner sc = new Scanner(System.in);
//                System.out.print("enter first number ");
//                    int a = sc.nextInt();
//                System.out.print("enter the second number ");
//                    int b = sc.nextInt();
//
//                System.out.println("Product of 2 numbers is :"+calculateProduct(a,b));
//            }
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("invalid Number");
            return;
        }
        int factorial = 1;
        for(int i =n; i>=1; i--){
            factorial = factorial *i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n! ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
