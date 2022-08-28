package Day08_OOPIntro;

import java.util.Arrays;

public class ClassIntro {
    public static void main(String[] args) {

        Customer cust1 = new Customer();

        cust1.eat();

        //测试形参是否需要设置的问题
//		int[] arr = new int[]{3,4,5,2,5};
//		cust1.sort();

        cust1.sleep(8);

    }
}

//客户类
class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
        return;
        //return后不可以声明表达式
//		System.out.println("hello");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");

        eat();
//		sleep(10);
    }

    public String getName(){

        if(age > 18){
            return name;

        }else{
            return "Tom";
        }
    }

    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }

    //体会形参是否需要设置的问题
//	public void sort(int[] arr){
//
//	}
//	public void sort(){
//		int[] arr = new int[]{3,4,5,2,5,63,2,5};
//		//。。。。
//	}

    public void info(){
        //错误的
//		public void swim(){
//
//		}

    }
}
