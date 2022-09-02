package Day11_Inheritance.InheritancePrivateTesting;

public class Person {
    String[] name;
    String[] gender;
    private int age;

    public Person(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(){
        this.age = 18;
    }

    public void eat(){
        System.out.println("Eat dinner!");
    }

    public void drink(){
        System.out.println("Drink water!");
    }

    public void run(){
        System.out.println("Taking exercise!");
    }

}
