package Day08_OOPIntro;

/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 *
 * 此代码是对StudentTest.java的改进：将操作数组的功能封装到方法中。
 *
 */

import Day08_OOPIntro.Student;

public class StudentList {
    public static void main (String[] args){

        //声明Student类型的数组
        Student[] stus = new Student[20];
        //虽然数组已经声明了，但是变量的属性还没有绑定
        //这个时候需要来一个循环进行“赋值”操作
        for(int i = 0 ; i < stus.length ; i++){
            //给数组元素给与“赋值”
            stus[i] = new Student();
            //这样之后，每一个stus[i]都有了Student类的属性

            //给Student对象进行赋值
            //学号
            stus[i].number = i + 1;
            //年级：1-6
            stus[i].grade = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩：0-100
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));

        }

        //调用manageFunction类的方法
        manageFunction fun = new manageFunction();
        //
        fun.printInfo(stus);
        System.out.println("****************");

        fun.searchGrade(stus , 3);
        System.out.println("****************");

        fun.sortScore(stus);
        fun.printInfo(stus);


    }
}
