package Day10_EncapsulationAndHiding;

public class Order_PrivateExer {
    public static void main(String[] args) {

        Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;//The field Order.orderPrivate is not visible



        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}

class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;


    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}



