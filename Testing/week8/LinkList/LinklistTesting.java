package week8.LinkList;

public class LinklistTesting {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(5);
        list.dispaly();
        System.out.println("---------------------------------");
        for(Object b : list){
            System.out.println(b);
        }
    }
}
