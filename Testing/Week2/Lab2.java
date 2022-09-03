package Week2;

import java.util.Scanner;

public class Lab2 {

    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        System.out.println("Please enter an operator: ");
        String operator = readKeyBoard(1 , false);
        char o = operator.charAt(0);
        if(!checkOperator(o)){
            System.out.println("Please check the input character!");
            return ;
        }
        System.out.println("Please enter another number: ");
        int number2 = scan.nextInt();
        int res = 0;
        boolean inChar = true;
        do {
            switch(o){
                case '-':
                    res = number - number2;
                    System.out.println("res is: " + res);
                    break;
                case '+':
                    res = number + number2;
                    System.out.println("res is: " + res);
                    break;
                case '*':
                    res = number * number2;
                    System.out.println("res is: " + res);
                    break;
                case '/':
                    res = number / number2;
                    System.out.println("res is: " + res);
                    break;
                default:
                    System.out.println("The input is wrong!");
                    inChar = false;
            }
        }while(!inChar);

        return ;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }

    private static boolean checkOperator(char o){
        if(o != '+'){
            if(o != '-'){
                if(o != '*'){
                    if(o != '/'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


