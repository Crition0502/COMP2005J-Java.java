package Day05_Project01_FamilyAccount;

import java.util.Scanner;

/**
 Utility工具类：
 将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节。
 */
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     用于界面菜单的选择。该方法读取键盘，如果用户键入’1’-’4’中的任意字符，则方法返回。返回值为用户键入字符。
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /**
     用于收入和支出金额的输入。该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值。
     */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            /**
             * @function Integer.parseInt(str)
             * @usage 将整型数据Integer转换为基本数据类型int
             * @effection
             * int i = Integer.parseInt(str);
             * System.out.println(i+1)；//输出4;
             * String str = ＂3＂;
             * System.out.println(str+1);//output 31;
             */
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                /**NumberFormatException
                 *数字格式异常。当试图将一个String转换为指定的数字类型
                 *而该字符串确不满足数字类型要求的格式时，抛出该异常.
                 */
                 System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     用于收入和支出说明的输入。该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值。
     */
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    /**
     用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            /**
             * @function toUpperCase
             * @effection 返回一个新的字符串，其中的文本全部为大写。
             */
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

    /**
     * @param limit 限制传输的字符总量
     * @return String line
     * @introduction: 检查输入的字符串满不满足对于长度的检查要求
     */
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}

