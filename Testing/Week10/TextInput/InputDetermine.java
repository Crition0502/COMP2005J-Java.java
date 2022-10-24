package Week10.TextInput;

import java.util.Scanner;

public class InputDetermine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int number:");
        if(scan.hasNextInt()){
            int x = scan.nextInt();
        }else{
            System.out.println("Not an int number!");
        }
    }
}
