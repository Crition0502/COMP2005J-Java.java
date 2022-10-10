package Day15_1_Abstract.Excercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 *  * （5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 *  * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 *  * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 *  * 月是某个Employee对象的生日，还要输出增加工资信息。
 */

public class PayrollSystem {
    public static void main (String[] args){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入月份：");
//        int month = scanner.nextInt();

        Calendar calender = Calendar.getInstance();
        int month = calender.get(Calendar.MONTH) + 1;

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("Nick" , 1002 , new MyDate(1992 , 2 , 28) , 10000);
        emps[1] = new HourlyEmployee("Dick" , 2001 , new MyDate(1991 , 5 , 6) , 1000 , 8);

        for(int i = 0 ; i < emps.length ; i++){
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println(salary);

            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！ 月工资增加了！！" + (salary + 100) );
            }else{
                System.out.println("现在的月份为：" + month);
            }

        }
    }
}
