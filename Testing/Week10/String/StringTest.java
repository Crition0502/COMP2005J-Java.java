package Week10.String;

/**
 * Some of the most useful ones are;
 * ▶ public int indexOf(String s)
 * ▶ public String[] split(String s)
 * ▶ public String subString(int b, int e)
 * ▶ public char charAt(int index)
 * ▶ public boolean equalsIgnoreCase(String s)
 *
 * 1.
 * Searching a String
 * indexOf returns the index within this string for the
 * first occurrence of a specified substring
 * E.g. "hello".indexOf("l") would return 2
 * We can use this to search for the information we need
 *
 * 2.
 * Splitting a String
 * split breaks a single string into an array of strings
 * The strings are split every time a particular string is found
 * E.g. "Sean is great".split(" ") would return
 * { "Sean", "is", "great"}
 * E.g. "hello".split("l") would return { "he", "o"}
 * Note the string we use to split is removed from the result
 *
 * 3.
 * Substrings
 * substring allows you to get just a piece of a string
 * indicated by two numbers (start and end index)
 * E.g. "Sean is great".substring(4,8) would return " is "
 * E.g. "hello".substring(0,2) would return "he"
 * All of the characters starting from the first index
 * and up to but not including the second index are returned
 *
 * 4.
 * Selecting a Single Character
 * We can also get a single character from a string using charAt
 * "Sean".charAt(2) would return ’a’
 * Remember indexes start at 0 and go to length - 1
 *
 * 5.
 * Are Two Strings the Same
 * We can use equals or equalsIgnoreCase to compare 2 strings
 * "Sean".equals("sean") will return false
 * "Sean".equalsIgnoreCase("sean") will return true
 * This is necessary because == compares the memory
 * addresses of two strings
 *
 *
 */

public class StringTest {
    public static void main(String[] args) {

    }
}
