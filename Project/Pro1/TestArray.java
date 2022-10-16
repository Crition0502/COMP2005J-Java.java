package Pro1;

/**
 * @description Store the values of an array and call them centrally
 * @note The application is inconvenient, cancel the use of this class
 */
public class TestArray {

    private int[] testA = {1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};

    //the sorting should be only based on the key element which is the first element.
    private int[][] testB =  {{71, 2}, {64, 8}, {31, 56}, {98, 1}, {3, 6}, {59, 837}, {49, 58}, {61, 8}};

    public TestArray() {

    }

    public int[] getTestA() {
        return testA;
    }

    public void setTestA(int[] testA) {
        this.testA = testA;
    }

    public int[][] getTestB() {
        return testB;
    }

    public void setTestB(int[][] testB) {
        this.testB = testB;
    }

    //To get the length of the testB! The first layer length!
//    public static void main (String[] args){
//        TestArray array = new TestArray();
//        int[][] demoArray = array.getTestB();
//        System.out.println(demoArray.length);
//    }

}
