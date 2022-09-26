package Week6;

import java.util.Random;

public class StaticVariables {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    double Area = Math.PI * count * count;

    /**
     * ▶ Final variables can be assigned only once
     * ▶ Once the value has been set, it will never change
     * ▶ The syntax for declaring a final variable is to add
     * the keyword final before the type of the variable
     * ▶ Compiler error if we change it
     *
     * Constant Variables
     *
     * ▶ Constant variables are variables that are final and
     * static
     * ▶ They have the attributes of both types of variables
     * ▶ Usually used to store values that will not and should
     * not change
     * ▶ Often called constants
     *
     * ▶ When a constant is declared it is shown in how the
     * variable is named
     * ▶ Constant variable names are declared using only
     * upper-case characters
     * ▶ Words are separated by an underscore ( )
     * ▶ For example SCREEN HEIGHT, SCREEN WIDTH etc...
     * ▶ Easy to recognise constants
     */

    private static Random rng = new Random();
    public static int roll1D6(){
        int d = rng.nextInt(6);
        // between 0 ( inclusive ) and the specified value ( exclusive )
        return 1 + d;
    }

    public static int roll2D6(){
        int d = roll1D6() + roll1D6();
        return d;
    }

}
