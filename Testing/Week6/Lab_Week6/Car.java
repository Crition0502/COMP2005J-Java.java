package Week6.Lab_Week6;

public class Car {
    public final String Manufacturer;
    public final String Model;
    public final double MaxSpeed;
    public static final int NumberOfWheels = 4;
    private double CurrentSpeed;

    public Car(String manufacturer , String modeldouble , double maxSpeed) {
        this.Manufacturer = manufacturer;
        this.Model = modeldouble;
        if(maxSpeed < 0){
            System.out.println("Error!");
        }
        this.MaxSpeed = maxSpeed;
    }

    /**
     * Note: Only static variables can be called by the static methods. Hence, it was important to declare
     * the variable NumberOfWheels as static; otherwise we would not be able to access it in the static
     * method printNumberOfWheelsInCar().
     */
    public static void printNumberOfWheelsInCar() {
        int testNumber = 5;
        System.out.print("Number of wheels in a car = ");
        System.out.println(NumberOfWheels);
    }

    //we need a getter method to access the value of the variable CurrentSpeed
    //because it's otherwise a private variable.
    public double getCurrentSpeed() {
        return CurrentSpeed;
    }

    //we need a setter method to set the value of the variable CurrentSpeed
    //because it's otherwise a private variable. Also, we can perform checks
    //before setting up the value of CurrentSpeed just like we did for maxSpeed
    //in the constructor.
    public void setCurrentSpeed(double currentSpeed) {
        CurrentSpeed = currentSpeed;
    }
}
