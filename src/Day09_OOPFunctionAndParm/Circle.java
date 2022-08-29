package Day09_OOPFunctionAndParm;

/*
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 * 一个findArea()方法返回圆的面积。
 *
 */

public class Circle {
    public static void main (String[] args){
        Circle demo = new Circle();
        demo.radius = 6;
        demo.findArea();
    }


    double radius;//半径

    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
