package Week6;

public class Visibility {
    /**
     * Access levels
     * ▶ public
     * ▶ protected
     * ▶ default
     * ▶ private
     * We usually call this as visibility
     */
    public int day;
    protected int year;
    int month; // Note that default is defined by no keyword
    private int hour;
    /**
     * Modifier The same class | The same package | A subclass | everywhere else
     *
     * public         Y               Y               Y             Y
     * protected      Y               Y               Y             N
     * default        Y               Y               N             N
     * private        Y               N               N             N
     *
     * Public
     * When something in a class is declared public, this
     * means that it can be accessed by any code
     *
     * Protected
     * When something is declared as protected, this
     * means that it can be accessed from within the same
     * class, package or by a subclass of this class
     *
     * Default
     * When no access specifier is defined, this means that
     * it can be accessed from within the same class or
     * package
     * Note: Useful with a good package structure
     *
     * Private
     * The Private is the most restrictive access level
     * Can only be accessed, changed or used from within
     * the same file
     *
     * There are 4 levels of access that we can allow for
     * every instance variable, class or method.
     * But how do we know which level should be used?
     * It comes down to a single question, who needs to
     * see or change this?
     *
     * Attention:
     * 1.For classes, we will mostly declare them as public
     * 2.Methods are often declared with different access
     * levels
     * Note:
     *  A. If we define a method that we expect others to use
     *  then it will be declared public
     *  B. If we define a method that we do not want others to
     *  use, but we would like to use it in other parts of our
     *  package, then we declare it default
     *  C. If we write a method that is only use from within
     *  our class then it should be declared as private
     */

    /**
     * Encapsulation
     *
     * Definition:
     * When declaring instance variables of a class, we
     * think backwards
     * Most instance variables should be declared as private
     * Only where an instance variable needs to be used
     * by another class would we use any other access level
     *
     * Encapsulation in programming languages is the
     * combination of two ideas,
     * ▶ The grouping together of instance variable and methods
     * into classes
     * ▶ The ability to restrict access to some of the objects
     * components
     */
    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    //The class declares a private variable, number. Since
    //number is private, code from outside this class
    //cannot access the variable directly

    public static void main(String[] args){
        Visibility number1 = new Visibility();
        number1.setStudentNumber(10);
        int tempNum = number1.getStudentNumber();
        System.out.println(tempNum);
    }
    //So, a setter is a method that updates value of a
    //variable. And a getter is a method that reads value
    //of a variable.
}
