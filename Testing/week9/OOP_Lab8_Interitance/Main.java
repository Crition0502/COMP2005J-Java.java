package week9.OOP_Lab8_Interitance;

public class Main {
    public static void main(String[] args) {
        // Create New Rectangle
        Rectangle myRectangle = new Rectangle(4.5, 2);
        System.out.print("Perimeter of the created rectangle is = ");
        System.out.println(myRectangle.getPerimeter());
        System.out.print("Area of the created rectangle is = ");
        System.out.println(myRectangle.getArea());
        // Create New Triangle
        Triangle myTriangle = new Triangle(4.5, 2, 3);
        System.out.print("Perimeter of the created triangle is = ");
        System.out.println(myTriangle.getPerimeter());
        System.out.print("Area of the created triangle is = ");
        System.out.println(myTriangle.getArea());
    }

}
