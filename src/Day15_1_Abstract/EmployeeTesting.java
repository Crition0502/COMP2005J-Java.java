package Day15_1_Abstract;

public class EmployeeTesting {
    public static void main (String[] args){
        Manager manager = new Manager("库克" , 1001 , 1 , 10000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
