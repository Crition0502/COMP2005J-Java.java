package Pro1;

public class SelectionSort_Pro1 {

    public static void main (String[] args){

        int[] testA = {1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};

        //the sorting should be only based on the key element which is the first element.
        int[][] testB =  {{71, 2}, {64, 8}, {31, 56}, {98, 1}, {3, 6}, {59, 837}, {49, 58}, {61, 8}};

        //Perform a one-dimensional selection sort algorithm
        SelectionSort_1D(testA);

        //print the sorting result of testA
        System.out.print("testA: {");
        for(int i = 0 ; i < testA.length -1 ; i++){
            //wrong method to print with ASCII
//            System.out.println(testA[i] + ' ');
            System.out.print(testA[i] + " , ");
        }
        System.out.println(testA[testA.length - 1] + "}");

        //Perform a two-dimensional selection sort algorithm
        SelectionSort_2D(testB);

        //print the sorting result of testB
        System.out.print("testB: {");
        for(int i = 0 ; i < testB.length - 1 ; i++){
            System.out.print("{" + testB[i][0] + " , " + testB[i][1] + "}, ");
        }
        System.out.println("{" + testB[testB.length - 1][0] + " , " + testB[testB.length - 1][1] + "}}");

        /**
         * Terminal result:
         * testA: {0 , 1 , 1 , 20 , 23 , 54 , 55 , 62 , 65 , 76 , 76 , 81 , 87}
         * testB: {{3 , 6}, {31 , 56}, {49 , 58}, {59 , 837}, {61 , 8}, {64 , 8}, {71 , 2}, {98 , 1}}
         */

    }



    /**
     * @description selection sort for 1D array
     * @param array (int[])
     * @return array (int [])
     */
    static int[] SelectionSort_1D(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            //The number of comparisons you have to make per round is N minus i
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    //Records the subscript of the smallest element that can be found so far
                    min = j;
                }
            }

            //Swap the minimum found with the value where i is located
            if (i != min) {
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }

        }


        return array;
    }

    /**
     * @description selection sort for 2D array
     * @param array (int[][])
     * @return array (int[][])
     * @note in this function, it is the small change version from the function SelectionSort_1D
     */
    static int[][] SelectionSort_2D(int[][] array){

        //Store the first array of the two-dimensional array separately
//        int[] turnArrayB = {};
//        for(int i = 0 ; i < array.length ; i++){
//            turnArrayB[i] = array[i][0];
//        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            //The number of comparisons you have to make per round is N minus i
            for (int j = i + 1; j < array.length; j++) {
                //for 2D array, we only need change the array[j][o], which means
                //add [0] tp represent the first value
                if (array[j][0] < array[min][0]) {
                    //Records the subscript of the smallest element that can be found so far
                    min = j;
                }
            }

            //Swap the minimum found with the value where i is located
            if (i != min) {
                //only need to change the tyoe of temp to the int[], which contains 2D array for sorting
                int[] tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }

        }

        return array;
    }

}