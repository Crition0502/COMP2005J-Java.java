package Day11_Inheritance.InheritancePrivateTesting;

public class Student extends Person{

    int grade;
    double exam;

    public Student(){

    }

    public Student(String[] name , String[] gender , int age){
        this.name = name;
        this.gender = gender;
        setAge();
    }

    public Student(int grade , double exam){
        this.grade = grade;
        this.exam = exam;
    }

    public void living(){
        eat();
        drink();
        run();
    }

    public void living(Student stu){
        eat();
        drink();
        run();
        System.out.println(getAge());
    }

}
