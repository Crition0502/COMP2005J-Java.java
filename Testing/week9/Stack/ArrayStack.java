package week9.Stack;

public class ArrayStack implements ClassStack{

    private int[] values;
    private int top;
    private int maxSize;

    public ArrayStack(int size) {
        values = new int[size];
        maxSize = size;
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int top() {
        return values[top-1];
    }

    @Override
    public void push(int i) {
        if(top < maxSize) {
            values[top] = i;
            top++;
        }
    }

    @Override
    public int pop() {
        int i = values[top-1];
        top--;
        return i;
    }

    public static void main(String[] args) {
        ClassStack a = new ArrayStack(10);
        ClassStack b = new ArrayStack(10);
        a.push(35);
        a.push(20);
        a.push(9);
        a.push(10);
        for(int i = 0 ; i < 4 ; i++) {
            int j = a.pop();
            b.push(j);
            System.out.println(b.top());
        }
    }

}
