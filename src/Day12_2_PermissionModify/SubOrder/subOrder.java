package Day12_2_PermissionModify.SubOrder;

import Day12_2_PermissionModify.Order;

public class subOrder extends Order{

    public void method(){
        orderPublic = 2;
        orderProtected = 3;

        methodPublic();
        methodProtected();
        method();
        //默认的无法在其他的包里面调用了，即使已经extends
        //也就是private和缺形都不能在另外一个包里面调用
//        methodDefault();
    }
}
