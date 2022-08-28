package Day08_OOPIntro;

public class Rectangular {
    int m;
    int n;
    public int print(int m , int n){
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
