package Day10_Project02_BankManagement.Demo;

public class CustomerDemo {

    /**
     * 创建Customer的属性
     */
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;


    /**
     * 以下生成关于Customer的Get与Set
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * 创建构造器(Auto)
     */
    public CustomerDemo(){

    }

    public CustomerDemo(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    /**
     * @Description 返回用户的详细具体信息，组合成一个字符串
     * @return String details
     */
    public String getDetails(){
        return name + "\t" + gender + "\t" + age + "\t" + phone + "\t" + email;
    }

}
