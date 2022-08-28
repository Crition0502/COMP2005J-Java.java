package Day08_OOPIntro;

/*
 * 3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 * 3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，
 * 并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */

import Day08_OOPIntro.Rectangular;

import java.util.Scanner;

public class PrintRectangular {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Rectangular m1 = new Rectangular();
        System.out.println("Please typein the lenghth and the hight, thanks!");
        m1.m = scan.nextInt();
        m1.n = scan.nextInt();
        int area = m1.print(m1.m, m1.n);
        System.out.println("The area is: " + area);

    }
}
