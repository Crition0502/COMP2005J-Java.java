package Week10.TextInput;

import java.util.Scanner;

/**
 * next     String      Reads the next token as a String
 * nextLine String      Reads all the tokens remaining on this line
 *
 *
 * nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
 *
 * next（）会自动消去有效字符前的空格，只返回输入的字符，不能得到带空格的字符串。
 *
 * （简单点说，next我只要字，nextLine我啥都要）
 *
 * !!!
 * 在每一个 next（）、nextDouble()  、nextFloat()、nextInt() 等语句之后加一个nextLine（）语句，
 * 将被next（）去掉的Enter结束符过滤掉。（顽皮点说，因为nextLine啥都要，所以有时候要错了空格，等不到所需输入）
 */

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int number:");
        int x = scan.nextInt();
        System.out.println("You entered: " + x);

        System.out.println("Enter a double number:");
        double y = scan.nextDouble();
        System.out.println("You entered: " + y);

        System.out.println("Enter a String:");
        String z = scan.next();
        System.out.println(" You entered <" + x + ">");

        System.out.println ("Enter a String: ");
        String z1 = scan.nextLine();
        System.out.println(" You entered <" + x + ">");
    }
}
