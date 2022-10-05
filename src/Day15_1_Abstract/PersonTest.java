package Day15_1_Abstract;

/**
 *
 * 抽象类的匿名子类
 *
 */

public class PersonTest {
    public static void main (String[] args){

        method(new Student()); // 匿名对象

        Worker worker = new Worker();
        method1(worker); // 非匿名的类非匿名的对象
        method1(new Worker()); // 非匿名的类匿名对象
        /*******************************************************************/

        /**
         * 抽象类的匿名子类
         * 创建了一个匿名子类的对象：p，这里的Person()是Person的一个匿名子类
         */
        Person p = new Person() {
            @Override
            public void run() {
                System.out.println("Run!");
            }

            @Override
            public void breath() {
                System.out.println("Breath!");
            }
        };

        method1(p);
        p.eat();
        p.breath();
        p.run();

        /*********************************************************************/

        /**
         *
         * 创建匿名子类的匿名对象
         *
         */
        method1(new Person() {
            @Override
            public void run() {
                System.out.println("Running!!");
            }

            @Override
            public void breath() {
                System.out.println("Breathing!!!");
            }
        });

    }

    public static void method1(Person p){
        p.eat();
    }

    public static void method(Student s){

    }
}

class Worker extends Person{

    @Override
    public void breath() {

    }

    @Override
    public void run() {

    }
}
