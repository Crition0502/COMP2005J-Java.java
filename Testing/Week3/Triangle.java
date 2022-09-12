package Week3;

public class Triangle {
    public static void main (String[] args){
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 7; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" " + (i+j-1) + " ");
            }
            System.out.println();
        }

        System.out.println();

        int n = 5; //number of rows in half diamond
        int space = n - 1;
        // run loop (parent loop)
        // till number of rows
        for (int i = 0; i < n; i++) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // Print i+1 stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
        // Repeat again in
        // reverse order
        space = 0;
        // run loop (parent loop)
        // till number of rows
        for (int i = n; i < 0; i--) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // Print i stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }

        System.out.println();

        /*
         *****************************************************
         */



    }
}
