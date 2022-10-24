package Pro1;

public class test {
    public static void main (String[] args){
        int[] testA = {1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};

        //the sorting should be only based on the key element which is the first element.
        int[][] testB =  {{71, 2}, {64, 8}, {31, 56}, {98, 1}, {3, 6}, {59, 837}, {49, 58}, {61, 8}};

        RankSort_1D(testA);

        RankSort_2D(testB);

        //rank sort with a separate array to restore the value of rank
//        int[] rank = {};
//        RankSort_1D(testA , rank);
//        for(int i = 0 ; i < rank.length ; i++){
//            System.out.println(rank[i]);
//        }

    }

    static void RankSort_1D(int[] arr){
        //store the number value to the object named ...
        NumberRank_1D[] numberRank = new NumberRank_1D[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            numberRank[i] = new NumberRank_1D(arr[i]);
        }

        for(int i = 0 ; i < numberRank.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(numberRank[j].number < numberRank[i].number){
                    numberRank[i].rank++;
                } else if (numberRank[j].number > numberRank[i].number) {
                    numberRank[j].rank++;
                }
            }
        }

        //SelectionSort used for sorting the numberRank as the value of rank
        for (int i = 0; i < numberRank.length - 1; i++) {
            int min = i;

            //The number of comparisons you have to make per round is N minus i
            for (int j = i + 1; j < numberRank.length; j++) {
                if (numberRank[j].rank < numberRank[min].rank) {
                    //Records the subscript of the smallest element that can be found so far
                    min = j;
                }
            }

            //Swap the minimum found with the value where i is located
            if (i != min) {
                NumberRank_1D temp = new NumberRank_1D();
                temp = numberRank[i];
                numberRank[i] = numberRank[min];
                numberRank[min] = temp;
            }

        }

        //print the result of rank sorting of the array: testA
        System.out.println("testA:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(numberRank[i].toString());
        }
    }

    static void RankSort_2D(int[][] arr){
        NumberRank_2D[] numberRank = new NumberRank_2D[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            numberRank[i] = new NumberRank_2D(arr[i][0] , arr[i]);
        }

        for(int i = 0 ; i < numberRank.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(numberRank[j].number < numberRank[i].number){
                    numberRank[i].rank++;
                } else if (numberRank[j].number > numberRank[i].number) {
                    numberRank[j].rank++;
                }
            }
        }

        //SelectionSort used for sorting the numberRank as the value of rank
        for (int i = 0; i < numberRank.length - 1; i++) {
            int min = i;

            //The number of comparisons you have to make per round is N minus i
            for (int j = i + 1; j < numberRank.length ; j++) {
                if (numberRank[j].rank < numberRank[min].rank) {
                    //Records the subscript of the smallest element that can be found so far
                    min = j;
                }
            }

            //Swap the minimum found with the value where i is located
            if (i != min) {
                NumberRank_2D temp = new NumberRank_2D();
                temp = numberRank[i];
                numberRank[i] = numberRank[min];
                numberRank[min] = temp;
            }

        }

        //print the result of rank sorting of the array: testB
        System.out.println("testB:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(numberRank[i].toString());
        }
    }

    //use a class to make the array and the rank result together
    static class NumberRank_1D {
        //store the value in the array
        int number;
        //store the rank value of the array number, and initiate it with integer 0
        int rank = 0;

        public NumberRank_1D() {

        }

        public NumberRank_1D(int number){
            this.number = number;
        }

        @Override
        public String toString() {
            return  "{number=" + number +
                    ", rank=" + rank +
                    '}';
        }
    }

    static class NumberRank_2D{
        int number;
        int rank;
        //store the array in the array
        int[] arr = {};

        public NumberRank_2D() {

        }

        public NumberRank_2D(int number, int[] arr) {
            this.number = number;
            this.arr = arr;
        }

        @Override
        public String toString() {
            return  "rank=" + rank +
                    ", arr={" + arr[0] + " , " + arr[1] +
                    "}";
        }
    }
}
