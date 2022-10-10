package Day15_2_Template;

/**
 * 抽象类的应用：模板方法的设计模式
 *
 */

public class TemplateTest {
    public static void main (String[] args){
        Template t = new subTemplate();
        t.spendTime();
    }
}

abstract class Template{
    // 计算某段代码需要花费所谓时间
    public void spendTime(){
        long start = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();
        System.out.println("Spend time is: " + (end - start) );

    }

    // 不确定需要计时的代码为什么，所以先建立一个抽象类
    public abstract void code();
}

class subTemplate extends Template{

    @Override
    public void code() {
        for(int i = 2 ; i <= 1000 ; i++){

            boolean isFlag = true;
            for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }

        }
    }
}
