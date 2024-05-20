package JavaFiles;

public class AdvancedQuestions {
    public static void main(String[] args) {
                int n = 4; //butterfly
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
            for (int j=1;j<=5;j++){ // 5 is the main chracter here
                System.out.print("*");
            }
            System.out.println();
        }
        //3rd question
        int h = 5;
        int number =0;
        for (int i = 1; i<=h; i++){
            for(int j = 1; j<=h-i; j++){
                System.out.print(" ");
            }
            for (int j =1; j<=i;j++){
                number++;
                System.out.println(number);
            }
        }
        System.out.println();
    }
}
