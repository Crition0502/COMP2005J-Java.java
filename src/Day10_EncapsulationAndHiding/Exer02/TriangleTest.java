package Day10_EncapsulationAndHiding.Exer02;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
//		t1.base = 2.5;//The field TriAngle.base is not visible
//		t1.height = 4.3;
        System.out.println("base : " + t1.getBase() + ",height : " + t1.getHeight());

        Triangle t2 = new Triangle(5.1,5.6);
        System.out.println("base : " + t2.getBase() + ",height : " + t2.getHeight());

        System.out.println("The area is: " + t2.areaTriangle());
    }
}
