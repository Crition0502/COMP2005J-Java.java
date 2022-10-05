package Day15_1_Abstract;

public class CommonEmployee extends Employee{
    @Override
    public void work() {
        System.out.println("在一线生产的员工！");
    }
}
