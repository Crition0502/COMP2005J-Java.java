package week8.LinkList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList implements Iterable{

    //静态内部类
    private static class Node {
        public int data;
        public Node next;

        public Node() { }

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first = null;
    private Node current = null;

    /**
     * @description 在MyLinkedList中添加元素
     * @param value
     */
    public void add(int value){
        //首先产生一个新的节点
        Node newNode = new Node(value);

        //1.如果没有任何节点存在
        if(first == null) {
            first = newNode;
            current = newNode;
        } else {
            //2，如果不是第一个节点
            current.next = newNode;
            current = newNode;
        }
    }

    /**
     * @discription 在控制台打印链表
     */
    public void dispaly(){
        Node node = first;
        while(node != null) {
            int value = node.data;
            System.out.println(value);
            node = node.next;
        }
    }

    @NotNull
    @Override
    public Iterator iterator() {
        //匿名内部类
        return new Iterator() {

            Node node = first; //外部类中的私有成员

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Object next() {
                int value = node.data;
                node = node.next;
                return value;
            }


        };
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }

}
