package Day08_OOPIntro;

import jdk.jfr.Description;
import org.jetbrains.annotations.NotNull;

/**
 * @Description 学生类的基本属性
 * @author crition
 * @date 2022.8.26
 * @parm int number
 * @parm int grade
 * @parm int score
 * @parm public String infoTogether()
 */
class Student {
    // 学号
    int number;
    // 年纪
    int grade;
    // 成绩
    int score;

    /**
     * @Description 集中用户信息
     * @author crition
     * @date 2022.8.26
     * @return String info of student
     */
    public String infoTogether(){
        return "学号:" + number + " 年级:" + grade + " 成绩:" + score;
    }
}

/**
 * @Description 管理学生的函数方法
 * @author crition
 * @date 2022.8.26
 * @parm public void printInfo(Student[] stus)
 * @parm public void searchGrade(Student[] stus , int grade)
 * @parm public void sortScore(Student[] stus)
 */
class manageFunction{

    /**
     * @Description 遍历并打印学生信息
     * @author crition
     * @date 2022.8.26
     * @param stus
     * @return null
     */
    public void printInfo(Student[] stus){
        for(int i = 0 ; i < stus.length ; i++){
            System.out.println(stus[i].infoTogether());
        }
    }

    /**
     * @Description 查找Student数组中指定年级的学生信息并打印
     * @author crition
     * @date 2022.8.26
     * @param stus
     * @param grade
     * @return null
     */
    public void searchGrade(Student @NotNull [] stus , int grade){
        for(int i = 0 ; i < stus.length ; i++){
            if(stus[i].grade == grade){
                System.out.println(stus[i].infoTogether());
            }
        }
    }

    /**
     * @Description 以学生的成绩作为标准进行排序操作
     * @author crition
     * @date 2022.8.26
     * @param stus
     * @return null
     */
    public void sortScore(Student[] stus){
        for(int i = 0 ; i < stus.length ; i++){
            for(int j = 0 ; j < stus.length - 1; j++){
                if(stus[j].score > stus[j + 1].score){
                    Student temp = new Student();
                    temp = stus[j];
                    //结合在一起：Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}
