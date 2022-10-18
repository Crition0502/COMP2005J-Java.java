package week9;

import java.util.Arrays;

public class sys{
    public static void main(String[] args){
        int [][] array = {{71,2},{64,8},{31,56},{98,1},{3,6},{59,837},{49,58},{61,8}};
        int Rank = 0;
        int [][] rank = new int[100][2];
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(array[i][0]>array[j][0]){
                    Rank++;
                }
                else{
                    Rank = Rank + 0;
                }
            }
            rank[Rank][0] = array[i][0];
            rank[i][1] = array[i][1];
        }

        for(int i = 0 ; i < 8 ; i++){
            System.out.println(rank[i][0] + rank[i][1]);
        }
    }
}
