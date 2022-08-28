package Day09_OOPFunctionAndParm;

import org.jetbrains.annotations.NotNull;

public class ArrayUtil {

    // 求数组的最大值
    public int getMax(int @NotNull [] arr) {
        /*
        @Null	被注释的元素必须为null
        @NotNull	被注释的元素不能为null
        @AssertTrue	被注释的元素必须为true
        @AssertFalse	被注释的元素必须为false
        @Min(value)	被注释的元素必须是一个数字，其值必须大于等于指定的最小值
        @Max(value)	被注释的元素必须是一个数字，其值必须小于等于指定的最大值
        @DecimalMin(value)	被注释的元素必须是一个数字，其值必须大于等于指定的最小值
        @DecimalMax(value)	被注释的元素必须是一个数字，其值必须小于等于指定的最大值
        @Size(max,min)	被注释的元素的大小必须在指定的范围内。
        @Digits(integer,fraction)	被注释的元素必须是一个数字，其值必须在可接受的范围内
        @Past	被注释的元素必须是一个过去的日期
        @Future	被注释的元素必须是一个将来的日期
        @Pattern(value)	被注释的元素必须符合指定的正则表达式。
        @Email	被注释的元素必须是电子邮件地址
        @Length	被注释的字符串的大小必须在指定的范围内
        @NotEmpty	被注释的字符串必须非空
        @Range	被注释的元素必须在合适的范围内
         */
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组的最小值
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求数组的总和
    public int getSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求数组的平均值
    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;
    }

    //如下的两个同名方法构成了重载
    //Java 允许同一个类中定义多个同名方法，只要它们的形参列表不同即可。
    //如果同一个类中包含了两个或两个以上方法名相同的方法，但形参列表不同，这种情况被称为方法重载（overload）。

    // 反转数组
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public void reverse(String[] arr){

    }

    // 复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    // 数组排序
    public void sort(int[] arr) {
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
                    //错误的：
//					swap(arr[j],arr[j + 1]);
                    //正确的：
                    swap(arr,j,j + 1);
                }

            }

        }
    }

    //错误的：交换数组中指定两个位置元素的值
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
    //正确的：交换数组中指定两个位置元素的值
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // 遍历数组
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // 查找指定元素
    public int getIndex(int[] arr, int dest) {
        // 线性查找：

        for (int i = 0; i < arr.length; i++) {

            if (dest == arr[i]) {
                return i;
            }

        }

        return -1;//返回一个负数，表示没有找到
    }

}
