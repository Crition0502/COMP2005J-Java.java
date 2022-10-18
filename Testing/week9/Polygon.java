package week9;

public class Polygon {

    int numberOfSides;
    double[] lengthOfSides;

    public Polygon(int sideNumbers, double[] sideLengths) {
        if (sideNumbers < 3) {
            System.out.println("ERROR: <3 sides on Polygon!");
            System.exit(0);
        }
        else if (sideLengths.length != sideNumbers) {
            System.out.println("Error: Discrepancy in variables!");
            System.exit(0);
        }
        else if (!isValidPolygon(sideLengths)) {
            System.out.println("Error: Polygon with such sides is invalid!");
            System.exit(0);
        }
        else {
            numberOfSides = sideNumbers;
            lengthOfSides = sideLengths;
        }
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < numberOfSides; i++) {
            perimeter += lengthOfSides[i];
        }
        return perimeter;
    }

    // This function is private for the Polygon Class and hence cannot be
    // accessed from anywhere else.
    private boolean isValidPolygon(double[] sideLengths) {
        boolean valid = true;
        for (int i = 0; i < sideLengths.length; i++) {
            double currSideLength = sideLengths[i];
            double otherSideLengths = 0;
            for (int j = 0; j < sideLengths.length; j++) {
                if (i != j) {
                    otherSideLengths += sideLengths[j];
                }
            }
            if (currSideLength >= otherSideLengths) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        // Given the Number of Sides
        int numberOfSides = 4;
        // Given the length of Each Side
        double[] sideLengths = {2, 8.5, 7, 3};
        for (int i = 0; i < sideLengths.length; i++) {
            System.out.println(sideLengths[i]);
        }
        Polygon myPolygon = new Polygon(numberOfSides, sideLengths);
        System.out.print("Perimeter of the created polygon is = ");
        System.out.println(myPolygon.getPerimeter());
    }

}
