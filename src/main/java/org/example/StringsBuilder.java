package org.example;

public class StringsBuilder {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
//        char at index 3
        System.out.println(sb.charAt(3));

//        set char at index
      sb.setCharAt(0,'P');
        System.out.println(sb);
//        TO INSERT
      sb.insert(2,'n');
        System.out.println(sb);

    }
}
