package Day10_EncapsulationAndHiding;

/*
 * JavaBean是一种Java语言写成的可重用组件。

	所谓JavaBean，是指符合如下标准的Java类：
		>类是公共的
		>有一个无参的公共的构造器
		>有属性，且有对应的get、set方法
 */

public class JavaBeanIntro {
    private int id;
    private String name;

    public JavaBeanIntro(){

    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

/*
    JavaBean 属性
    一个 JavaBean 对象的属性应该是可访问的。这个属性可以是任意合法的 Java 数据类型，包括自定义 Java 类。

    一个 JavaBean 对象的属性可以是可读写，或只读，或只写。JavaBean 对象的属性通过 JavaBean 实现类中提供的两个方法来访问：

        方法	描述
        getPropertyName()	举例来说，如果属性的名称为 myName，那么这个方法的名字就要写成 getMyName() 来读取这个属性。这个方法也称为访问器。
        setPropertyName()	举例来说，如果属性的名称为 myName，那么这个方法的名字就要写成 setMyName()来写入这个属性。这个方法也称为写入器。
        一个只读的属性只提供 getPropertyName() 方法，一个只写的属性只提供 setPropertyName() 方法。

 */

//一个类通过关键字implements声明自己使用一个或者多个接口。
class StudentsBean implements java.io.Serializable
{
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public StudentsBean() {
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
