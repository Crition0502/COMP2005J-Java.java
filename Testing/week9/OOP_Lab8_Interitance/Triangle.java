package week9.OOP_Lab8_Interitance;

import java.lang.Math;

public class Triangle extends Polygon {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        // Note: Call to the constructor of super-class must be the first
        // statement in the constructor of the sub-class. Hence, the array
        // of side lengths is created in-line.
        super(3, new double[] {a, b, c});
        // Use 'this' keyword to identify the difference between class
        // variables and constructor/method parameters.
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = super.getPerimeter() / 2;
        return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

}

