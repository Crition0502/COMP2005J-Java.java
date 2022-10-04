package Day15_1_Abstract;

public class AbstractTesting {
    public static void main (String[] args){
//        Person P1 = new Person(); //'Person' is abstract; cannot be instantiated
        //一旦Person类抽象了就不可以实例化了
//        P1.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }

    //不是抽象方法
//    public void run(); //Missing method body, or declare abstract
    //是抽象方法
    public abstract void run(); // 抽象方法只有方法声明没有方法体

}

class Student extends Person{
    public Student(String name , int age){
        //抽象类中一定有构造器，便于子类实例化对象
        super(name , age);
    }

    // Class 'Student' must either be declared abstract or
    // implement abstract method 'run()' in 'Person'
    // 重写之后，就可以将子类实例化
    @Override
    public void run() {
        System.out.println("running!");
    }

    @Override
    public void breath() {
        System.out.println("雾霾！");
    }
    //不重写的话因为extends了，所以包含抽象方法，只能将这个类也abstract
    // abstract class Student extends Person
}