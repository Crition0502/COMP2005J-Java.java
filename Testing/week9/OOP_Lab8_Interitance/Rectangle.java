package week9.OOP_Lab8_Interitance;

public class Rectangle extends Polygon {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        // Note: Call to the constructor of super-class must be the first
        // statement in the constructor of the sub-class. Hence, the array
        // of side lengths is created in-line.
        super(4, new double[]{length, breadth, length, breadth});
        // Use 'this' keyword to identify the difference between class
        // variables and constructor/method parameters.
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

