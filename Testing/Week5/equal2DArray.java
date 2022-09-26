package Week5;

import java.util.Arrays;

public class equal2DArray {
    public boolean equal2DArray(final String[][] arr1, final String[][] arr2) {
        if (arr1 == null) {
            return (arr2 == null);
        }
        if (arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {

            if (!Arrays.equals(arr1[i], arr2[i])) {

                return false;
            }
        }
        return true;
    }
}
