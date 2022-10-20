package Day16_ExceptionHandling.Exception;

public class Exception01_DeclareThrowException {
    public static void main(String[] args) {

    }
}

class ThrowExceptionTest{

    public void openThisFile(String fileName) throws java.io.FileNotFoundException{

    }

    //申明抛出多个异常
    public Object convertFileToObject(String fileName)
        throws java.io.FileNotFoundException , java.lang.ClassNotFoundException{
        return new Object(){

        };
    }

    //调用方法也可以将异常再抛给它的调用方法
    public void getCustomerInfo() throws java.io.FileNotFoundException{
        //...
        this.openThisFile("customer.txt");
        //...
    }
    //在这个方法中，如果openThisFile方法抛出了异常，getCustomerInfo
    //方法将停止执行，并将此异常传递给getCustomerInfo方法的方法中去
}
