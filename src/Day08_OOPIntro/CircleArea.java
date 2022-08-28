package Day08_OOPIntro;

/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
//测试类

import Day08_OOPIntro.Circle;
import java.util.Scanner;

public class CircleArea {
    public static void main (String[] args){
        Circle ci = new Circle();
        System.out.println("请输入圆的半径：");
        Scanner scan = new Scanner(System.in);
        ci.radius = scan.nextDouble();
        double area = ci.findArea();
        System.out.println("圆的面积为：" + area);
    }
}
