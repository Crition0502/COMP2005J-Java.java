package Day09_OOPFunctionAndParm;

public class ValueTransferFunction_02 {
    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

        ValueTransferFunction_02 test = new ValueTransferFunction_02();
        test.swap(data);


        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m;
    int n;

}
