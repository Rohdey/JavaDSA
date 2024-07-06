package org.example;

public class practice {
    public static void main(String[]args){
        String[] cars = {"volvo", "maruti","tata"};
        cars[0]="openl";
        for(String i : cars){
            System.out.println(i);
        }
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}
