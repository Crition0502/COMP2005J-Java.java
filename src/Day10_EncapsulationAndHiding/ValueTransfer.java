package Day10_EncapsulationAndHiding;

public class ValueTransfer {
    public static void main(String[] args) {

        String s1 = "hello";

        ValueTransfer test = new ValueTransfer();
        test.change(s1);

        System.out.println(s1);//hi~~


    }

    public void change(String s){
        s = "hi~~";
    }
}
