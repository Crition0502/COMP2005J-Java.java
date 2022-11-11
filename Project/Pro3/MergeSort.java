package Pro3;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        //Type the number into array
        System.out.println("The size of the array: (like x rows, y columns)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the number of row:");
        int row = scan.nextInt();
        System.out.println("Please type the number of column:");
        int column = scan.nextInt();
        System.out.println("Please type the number in the array:");
        int[][] arr = new int[row][column];
        scan.nextLine();
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array you put:");
        printArr(arr);

        //MergeSort running
        System.out.println();
        mergeSort(arr ,0 , column - 1);
        System.out.println("The result of quick sort:");
        printArr(arr);

    }

    private static void merge(int[] arr , int l , int m , int r){
        int low = l;
        int high_pointer = m + 1;
        int[] temp = new int[r - l + 1];
        int k = 0;
        while(low <= m && high_pointer <= r)
        {
            if(arr[low] <= arr[high_pointer])
            {
                temp[k++] = arr[low++];
            }
            else
            {
                temp[k++] = arr[high_pointer++];
            }
        }
        while(low <= m)
        {
            temp[k++] = arr[low++];
        }
        while(high_pointer <= r)
        {
            temp[k++] = arr[high_pointer++];
        }

        for(int key = l ; key < l + temp.length ; key++){
            arr[key] = temp[key-l];
        }

    }


    public static void mergeSort(int[][] arr, int l , int r){
        for(int count = 0 ; count < arr.length ; count++){
            if((r - l) > 1) {
                int mid = (l + r) / 2;
                mergeSort(arr , l, mid);
                mergeSort(arr , mid + 1, r);
            }
            merge(arr[count] , l , (l + r) / 2 , r);
        }
    }

    private static void printArr(int[][] arr){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length - 1 ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(arr[i][arr[i].length - 1]);
        }
    }

}
