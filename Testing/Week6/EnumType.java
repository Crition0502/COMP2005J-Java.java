package Week6;

public class EnumType {
    public enum Major{
        SOFTWARE_ENGINEERING ,
        INTERNET_OF_THINGS_ENGINEERING ,
        ELECTRONIC_ENGINEERING , FINANCE
    }

    static void main (String[] args){
        Major degree = Major.ELECTRONIC_ENGINEERING;
        System.out.println(degree);
    }
}
