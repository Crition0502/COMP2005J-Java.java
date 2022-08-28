package Day05_Project01_FamilyAccount;


class FamilyAccount{

    public static void main(String[] args){

        boolean isFlag = true;

        //用于记录用户的收入和支出的详情(主菜单显示1)
        //用String details去记录用户的使用数据
        String details = "收支\t账户金额\t收支金额\t说    明\n";

        //初始金额
        int balance = 1000;

        while(isFlag){

            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.println("                   请选择(1-4)：");


            /**
             * @function Utility.readMenuSelection()
             * @return char
             * @usage read mean number user typing
             */
            char selection = Utility.readMenuSelection();

            //获取用户的选择：1-4
            switch (selection) {

                //1.收支明细
                case '1' -> {
                    //System.out.println("1.收支明细");
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------------");
                }

                //2，登记收入
                case '2' -> {
                    //System.out.println("2.登记收入");
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addInfo = Utility.readString();

                    //处理balance
                    balance += addMoney;

                    //处理details
                    details += ("收入\t" + balance + "\t" + addMoney + "\t" + addInfo + "\n");
                    System.out.println("---------------------登记完成---------------------\n");
                }
                case '3' -> {
                    //System.out.println("3.登记支出");

                    System.out.print("本次支出金额：");
                    int minusMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String minusInfo = Utility.readString();

                    //处理balance
                    if (balance >= minusMoney) {
                        balance -= minusMoney;

                        //处理details
                        details += ("支出\t" + balance + "\t" + minusMoney + "\t\t" + minusInfo + "\n");
                    } else {
                        System.out.println("支出超出账户额度，支付失败");
                    }
                    System.out.println("---------------------登记完成---------------------\n");
                }
                case '4' -> {
                    //System.out.println("4.退  出");
                    System.out.print("确认是否退出(Y/N)：");

                    /**
                     * @function Utility.readConfirmSelection()
                     * @return char (big letter Y && N)
                     * @usage read user's exit command
                     */
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                }

                //当使用4进行推出的时候，无需这里的break结束循环
                //break;
            }



        }

    }

}
