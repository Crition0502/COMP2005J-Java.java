package week9.Stack;

//Write an algorithm that verifies the bracket matching (), {}, [] in a string using Stack data type.

/**
 *  E push(E item)
 *           把项压入堆栈顶部。
 *  E pop()
 *           移除堆栈顶部的对象，并作为此函数的值返回该对象。
 *  E peek()
 *           查看堆栈顶部的对象，但不从堆栈中移除它。
 *  boolean empty()
 *           测试堆栈是否为空。
 *  int search(Object o)
 *           返回对象在堆栈中的位置，以 1 为基数。
 */

import java.util.*;

public class BalancedParan
{
    static boolean areParenthesisBalanced(String expr)
    {
        Stack<Character> stack = new Stack<Character>();
//        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;

            char check;
            switch (x)
            {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        String expr = "([{}])";
        if (areParenthesisBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
