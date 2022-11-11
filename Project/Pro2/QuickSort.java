package Pro2;

import java.util.Scanner;

/**
 * Test Case 1:
 * 31 33 27 15 42 11 40 5 19 21
 *
 * Test Case 2:
 * 98 34 100 36 44 64 3 99 59
 * 20 88 55 91 14 58 25 29 44
 * 66 62 4 65 49 71 71 24 12
 * 14 3 58 23 12 66 11 45 36
 * 55 64 35 24 85 73 33 85 46
 * 94 76 23 36 57 26 8 92 17
 * 85 68 52 34 53 93 4 37 34
 * 70 9 15 42 31 16 72 61 62
 * 11 38 34 21 81 9 45 68 11
 * 20 83 27 6 69 26 5 31 8
 * 74 97 11 60 1 68 14 27 46
 */

public class QuickSort {

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
        scan.nextLine();//用来跳过行列后的回车符
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array you put:");
        printArr(arr);

        System.out.println("-----------------------------------");


        long startTime = System.nanoTime();

        quickSort(arr , 0 , column - 1);
        System.out.println("The result of quick sort:");
        printArr(arr);


        long overTime = System.nanoTime();
        System.out.println("程序运行时间为："+(overTime-startTime)+"纳秒");

    }

    public static void quickSort(int[][] arr , int lo , int hi){
        for(int count = 0 ; count < arr.length ; count++){
            int i = 0 , j = 0 , temp = 0 , t = 0;

            //Control the loop times in the program
            if(lo > hi){
                return ;
            }

            i = lo;
            j = hi;
            //basic position
            temp = arr[count][lo];

            while (i < j) {
                //Let's go to the right first, decreasing to the left
                while (temp <= arr[count][j] && i < j) {
                    j--;
                }
                //And then on the left, increasing to the right
                while (temp >= arr[count][i] && i < j) {
                    i++;
                }

                if (i < j) {
                    t = arr[count][j];
                    arr[count][j] = arr[count][i];
                    arr[count][i] = t;
                }

            }

            //Finally, the benchmark is the exchange of numbers at positions equal to i and j
            arr[count][lo] = arr[count][i];
            arr[count][i] = temp;

            //Call the left half array recursively
            quickSort(arr, lo, j - 1);
            //Call the right half array recursively
            quickSort(arr, j + 1, hi);

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