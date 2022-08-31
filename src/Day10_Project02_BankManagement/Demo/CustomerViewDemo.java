package Day10_Project02_BankManagement.Demo;

public class CustomerViewDemo {

    //创建私有的存储用户信息的数组
    private CustomerListDemo customers = new CustomerListDemo(10);

    //创建构造器，初始化用户名单
    public CustomerViewDemo(){
        CustomerDemo cust = new CustomerDemo("张三" , '男' , 30 , "114514" , "1919810@XBZ.com");
        customers.addCustomer(cust);
    }

    public void enterMainMenu(){
        boolean loopFlag = true;
        //通过do_while循环和loopFlag参数来实现可控制的循环
        //为什么不用while？
        //因为do_while的特性
        do {
            //显示菜单界面
            System.out.println("-----------------客户信息管理软件-----------------\n");
            System.out.println("                 1 添 加 客 户");
            System.out.println("                 2 修 改 客 户");
            System.out.println("                 3 删 除 客 户");
            System.out.println("                 4 客 户 列 表");
            System.out.println("                 5 退       出\n");
            System.out.print("                    请选择(1-5)：");

            //输入功能切换
            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch(key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出（Y/N）:");
                    char comfirm = CMUtility.readConfirmSelection();
                    if(comfirm == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);

    }

    private void addNewCustomer(){

        //进行信息的录入
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);

        //将输入的信息纳入customers数组之中
        CustomerDemo cust = new CustomerDemo(name , gender , age , phone , email);
        boolean flag = customers.addCustomer(cust);
        if(flag){
            System.out.println("---------------------添加完成---------------------");
        }else{
            System.out.println("-----------------记录已满,无法添加-----------------");
        }

    }

    private void modifyCustomer(){

        System.out.println("---------------------修改客户---------------------");

        //判断所要修改的用户是否存在
        int index = 0;
        CustomerDemo cust = null;
        for(;;){
            System.out.print("请选择想要修改的客户编号（-1退出）：");
            index = CMUtility.readInt();
            if(index == -1){
                return ;
            }

            cust = customers.getCustomer(index - 1);
            if(cust == null){
                System.out.println("无法找到指定客户！");
                //然后进入死循环一直重复输入直到成功或者输入-1退出
            }else{
                break;
            }
        }

        //进行就该信息的输入操作
        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("年龄(" + cust.getAge() + ")：");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readString(15, cust.getEmail());

        //一样的判断输入操作
        cust = new CustomerDemo(name , gender , age , phone , email);
        boolean flag = customers.replaceCustomer(index - 1 , cust);
        if(flag){
            System.out.println("---------------------修改完成---------------------");
        }else{
            System.out.println("------------无法找到指定客户,修改失败---------------");
        }
    }

    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------");

        int index = 0;
        CustomerDemo cust = null;
        for(;;){
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if(index == -1){
                return ;
            }

            cust = customers.getCustomer(index - 1);
            if(cust == null){
                System.out.println("无法找到指定客户！");
            }else{
                break;
            }

            System.out.print("确认是否删除(Y/N)：");
            char confirm = CMUtility.readConfirmSelection();
            if(confirm == 'N'){
                return ;
            }

            boolean flag = customers.deleteCustomer(index - 1);
            if(flag){
                System.out.println("--------------------删除完成----------------------");
            }else{
                System.out.println("------------无法找到指定客户,删除失败---------------");
            }
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        CustomerDemo[] custs = customers.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("没有客户记录！");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            for (int i = 0; i < custs.length; i++) {
//            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
                System.out.println((i+1) + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main (String[] args){
        CustomerViewDemo testView = new CustomerViewDemo();
        testView.enterMainMenu();

    }
}
