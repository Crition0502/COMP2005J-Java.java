package Week4;

public class StaticTestMain {
    public static void main (String[] args){
        StaticTest D1 = new StaticTest(0.2);
        StaticTest D2 = new StaticTest(0.4);
        StaticTest D3 = new StaticTest(0.8);

        System.out.println(StaticTest.number);
    }
}
