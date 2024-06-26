package org.example;

public class AdvancedQuestions {
    public static void main(String[] args) {
                int n = 4; //butterfly Q1
                for (int i = 1; i <= n; i++) { //upper half
                    // Print stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Print spaces
                    for (int j = 1; j <= 2 * (n - i); j++) { //spaces count 2*(n-1)
                        System.out.print(" ");
                    }
                    // Print stars again
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = n; i >= 1; i--) {  //lower half
                    // Print stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Print spaces
                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }
                    // Print stars again
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        System.out.println();
                //2nd question
        for (int i = 1; i<=n; i++){
            int spaces = n-i;
            for (int j =1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){ // 5 is the main character here
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3rd question //numbers pyramid
        int h = 5;
        for (int i = 1; i<=h; i++){
            for(int j = 1; j<=h-i; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i;j++) {
                System.out.print(i + " ");
            }
               System.out.println();

        }
        System.out.println();
        // PALINDROMIC PATTERN == BOB/212 //4TH QUESTION
        for (int i =1; i<=h;i++){// using int h defined in question 3
            //spaces
            for(int j = 1; j<=h-i;j++){
                System.out.print(" ");

            }//first half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }//second half
            for (int j =2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //diamond pattern //5th Question
        for (int i =1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i>=1; i--) { //same s 1st question lower half
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
