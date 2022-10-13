package Day15_3_Interface;

/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程！
 *
 */

public class USB_Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        //2. 创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB(){

            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }

        };
        computer.transferData(phone);

        //4. 创建了接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}

interface USB{
    //常量：定义了长、宽、最大最小的传输速度等
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }

}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }

}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体的传输细节：......");
        usb.stop();
    }
}
