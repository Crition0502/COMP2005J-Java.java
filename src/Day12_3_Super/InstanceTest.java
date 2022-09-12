package Day12_3_Super;

public class InstanceTest {
    public static void main(String[] args)
    {
        new Zi();
    }
}

class Fu
{
    Fu()
    {
        System.out.println("fu run");
    }
}

class Zi extends Fu
{
    Zi()
    {
        //super();  //调用的是父类中的空参数的构造函数
        System.out.println("zu run");
        System.out.println("Help!");
    }
}