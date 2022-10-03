package Week6.TimeCalculation;

public class nanoTime {
    public static void main(String[] args) throws InterruptedException {
        // 开始时间
        long stime = System.nanoTime();
        // 执行时间（1s）
        Thread.sleep(1000);
        // 结束时间
        long etime = System.nanoTime();
        // 计算执行时间
        System.out.printf("执行时长：%d 纳秒.", (etime - stime));
    }
}
