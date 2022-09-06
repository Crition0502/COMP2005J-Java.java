package Week2;


public class ArrayTest {

    public static void main (String[] args){
        int listArray[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int i = 3;
        listArray[i++] = 6;
        for(int j = 0 ; j < listArray.length ; j++){
            System.out.println(listArray[j]);
        }

    }
}
