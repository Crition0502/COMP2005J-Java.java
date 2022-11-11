package Pro1;

public class InsertionSort_Pro1 {
    public static void main (String[] args){
        int[] testA = {1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};

        //the sorting should be only based on the key element which is the first element.
        int[][] testB =  {{71, 2}, {64, 8}, {31, 56}, {98, 1}, {3, 6}, {59, 837}, {49, 58}, {61, 8}};

        InsertSort_1D(testA);

        InsertSort_2D(testB);

    }

    static void InsertSort_1D(int[] array){
        for (int i = 0; i < array.length; i++) {
            //Take the unsorted new element
            int insertElement = array[i];
            int temp = i;
            for (int j = temp - 1; j >= 0 ; j--) {
                //If the new element is less than the sorted element, move right
                if(insertElement < array[j]){
                    array[j+1] = array[j];
                    temp--;
                }
            }
            array[temp] = insertElement; //insert the new element
        }

        System.out.print("testA: {");
        for(int i = 0 ; i < array.length - 1 ; i++){
            System.out.print(array[i] + " , ");
        }
        System.out.println(array[array.length - 1] + "}");
    }

    static void InsertSort_2D(int[][] array){
        for (int i = 0; i < array.length; i++) {
            //Take the unsorted new element
            int[] insertElement = array[i];
            int temp = i;
            for (int j = temp - 1; j >= 0; j--) {
                //If the new element is less than the sorted element, move right
                if(insertElement[0] < array[j][0]){
                    array[j+1] = array[j];
                    temp--;
                }
            }
            array[temp] = insertElement; //insert the new element
        }

        System.out.print("testB: {");
        for(int i = 0 ; i < array.length - 1 ; i++){
            System.out.print("{" + array[i][0] + ", " + array[i][1] + "} , ");
        }
        System.out.println("{" + array[array.length - 1][0] + ", " + array[array.length - 1][1] + "}}");
    }
}
