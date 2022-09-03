package Week2;

import java.util.Scanner;

public class Lab2_2 {

    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args){
        int num = 0;
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("It's an even number!");
        }else{
            System.out.println("It's an odd number!");
        }
        return ;
    }

}
