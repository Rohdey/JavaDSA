public class starRow {
    public static void main(String[]args){
//        star pyramid
        int n = 4;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
////INVERTED STAR PYRAMID
        int in = 4;
        for (int i=in; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
                 System.out.println();
        }
        System.out.println();

        int y = 4;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Moved inside the outer loop to print a newline after each row
        }
        System.out.println();
        int k = 5;
        for(int i =1; i<=k; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        int l = 5;
        for(int i =1; i<=l; i++){
            for (int j =1; j<=l-i+1; j++){ //l-i+1 is the major key here in this code that making this code in reverse
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        int d = 5;
        int number =1;
        for (int i =1; i<=d; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i =1; i<=d;i++){
            for (int j =1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int g =5;
        for (int i = 1; i<=g; i++){
            System.out.print(" ");
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            for (int b =i; k>1;b--){
                System.out.println(b);

            }

            }
            System.out.println();

        }
    }


}
