package Day05_Loop;

/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。

说明：break关键字的使用：一旦在循环中执行到break，就跳出循环
*/

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

public class Loop_GCDandLCM {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int num1 = scan.nextInt();

        System.out.println("请输入第二个数字");
        int num2 = scan.nextInt();

        //获取最大公约数
        //1.获取较小的那个数
        //① 判断赋值
        int minLogic = 0;
        if(num1 < num2){
            minLogic = num1;
        }else{
            minLogic = num2;
        }
        //② 三元运算符
        int minSanYuan = (num1 <= num2) ? num1 : num2;
        //③ API Math.min
        int min = Math.min(num1 , num2);
        //2,遍历判断
        for(int i = min ; i >= 1 ; i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
                //不要贪，得到结果就退出
            }
        }

        //获取最小公倍数
        //1.获取较大值
        int maxLogic = 0;
        if(num1 > num2){
            maxLogic = num1;
        }else{
            maxLogic = num2;
        }
        int maxSanYuan = (num1 >= num2) ? num1 : num2;
        int max = Math.max(num1 , num2);
        //2.遍历得到最小公倍数
        for(int i = max ; i <= num1*num2 ; i++){
            if(i % num1 == 0 && i % num2 == 0){
                System.out.println("最小公倍数：" + i);
                break;
            }
        }
    }
}
