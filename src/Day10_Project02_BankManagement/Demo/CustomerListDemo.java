package Day10_Project02_BankManagement.Demo;

public class CustomerListDemo {

    //用来保存用户数据的数组
    private CustomerDemo[] customers;
    //记录已保存的用户对象的数量
    private int totalNumber = 0;

    /**
     * @description 创建了关于CustomerListDemo的一个构造器，用来初始化customers数组
     * @param totalCustomer :指定数组最大长度
     */
    public CustomerListDemo(int totalCustomer){
        customers = new CustomerDemo[totalCustomer]; //初始化存储数组成功（操作数组之前都得初始化）
    }

    /**
     * @description 添加用户信息
     * @param customer
     * @return true:添加成功 false:添加失败
     */
    public boolean addCustomer(CustomerDemo customer){
        //上来就判断存储数组有没有满
        if(totalNumber >= customers.length){
            return false;
        }

        //有空间存储，则进行数据的存放，在customers[totalNumber]
        customers[totalNumber] = customer;
        totalNumber += 1;
        return true;
    }

    /**
     * @description 修改指定索引的客户信息
     * @param index
     * @param customer
     * @return true:修改成功 false:修改失败
     */
    public boolean replaceCustomer(int index , CustomerDemo customer){
        //判断index参数是否合理合情
        if(index < 0 || index >= totalNumber){
            return false;
        }

        //验证成功，修改此处索引的用户信息
        customers[index] = customer;
        return true;
    }

    /**
     * @Description 删除指定索引的客户信息
     * @param index
     * @return true:成功删除 false:删除失败
     */
    public boolean deleteCustomer(int index){
        //判断index参数是否合理合情
        if(index < 0 || index >= totalNumber){
            return false;
        }

        //从customers[index]开始，将后面的信息往前移一位
        //在这里i < totalNumber - 1，记得减1，保证不出错
        for(int i = index ; i < totalNumber - 1 ; i++){
            customers[i] = customers[i + 1];
        }
        //最后一个数据元素需要置空
        customers[totalNumber - 1] = null;
        //因为删除了一个，所以总量要减一
        totalNumber -= 1;
        //上面两行代码的简便版本
//        customers[--totalNumber] = null;
        return true;
    }

    /**
     * @description 返回全部的客户信息
     * @return custs
     */
    public CustomerDemo[] getAllCustomers(){
//        return customers;
        //不可以像上面那样直接返回存储数组，因为存储数组中有空的元素(total小于初始化数组长度的时候)
        //我们希望返回一个非空的数组来展现客户信息

        //新建一个存储数组进行输出返回
        CustomerDemo[] custs = new CustomerDemo[totalNumber];
        for(int i = 0 ; i < totalNumber ; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * @description 返回某一个索引位置的客户信息
     * @param index
     * @return 如果成功，则返回customers[index] 如果失败，则返回null
     */
    public CustomerDemo getCustomer(int index){
        if(index < 0 || index >= totalNumber){
            return null;
        }
        return customers[index];
    }

    /**
     * @description 返回用户信息的个数
     * @return totalNumber
     */
    public int getTotal(){
        return totalNumber;
        //错误的语法
//        return customers.length;
    }



}
