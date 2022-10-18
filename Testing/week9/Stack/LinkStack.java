package week9.Stack;

public class LinkStack implements ClassStack{

    public class Node {
        int data;
        Node next;
        public Node(int i) {
            data = i;
        }
    }

    Node top;
    int size;
    public LinkStack() {
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int top() {
        return top.data;
    }
    public void push(int i) {
        Node N = new Node(i);
        N.next = top;
        top = N;
        size++;
    }
    public int pop() {
        int i = top.data;
        top = top.next;
        size--;
        return i;
    }
    public static void main(String[] args){
        ClassStack s = new LinkStack();
        for(int i = 0 ; i < 10 ; i++) {
            s.push(i);
        }
        s.push(1);
        System.out.println(s.size());
        for(int i = 0 ; i < 11 ; i++)
            System.out.println(s.pop());
    }

}
