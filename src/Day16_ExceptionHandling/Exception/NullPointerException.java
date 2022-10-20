package Day16_ExceptionHandling.Exception;

public class NullPointerException {
    public static void main(String[] args) {
        Image im[] = new Image[4];
//        im[0] = new Image();
        System.out.println(im[0].toString());
    }
}

class Image{
    int i = 0;
}
