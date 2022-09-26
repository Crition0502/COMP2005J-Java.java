package Week6.Lab_Week6;

public class Main {
    public static void main (String[] args){

        Car car1 = new Car("Honda", "CR-V", 130.0);
        Car car2 = new Car("Nissan", "Tiida", -137);

        Car.printNumberOfWheelsInCar();

        System.out.println(car1.Manufacturer);
        System.out.println(car1.Model);
        System.out.println(car1.MaxSpeed);
        car1.setCurrentSpeed(60);
        System.out.print("Current speed of Car1 = ");
        System.out.println(car1.getCurrentSpeed());


        System.out.println(car2.Manufacturer);
        System.out.println(car2.Model);
        System.out.println(car2.MaxSpeed);
        car2.setCurrentSpeed( - 30.5);
        System.out.print("Current speed of Car2 = ");
        System.out.println(car2.getCurrentSpeed());

    }
}
