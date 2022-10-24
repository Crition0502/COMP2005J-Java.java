package Week10.Queue;

public class LinkQueue implements Queue{
    private Node front;//队首指针
    private Node rear;//队尾指针
    public LinkQueue(){
        front=rear=null;
    }
    @Override
    public void clear() {
        front=rear=null;
    }

    @Override
    public boolean isEmpty() {//判断队列是否为空
        return front==null;
    }

    @Override
    public int length() {//求长度
        Node p=front;
        int length=0;
        while (p!=null){
            p=p.next;
            length++;
        }
        return length;
    }

    @Override
    public Object peek() {//入队
        if (front!=null){
            return front.data;
        }else {
            return null;
        }
    }

    @Override
    public void offer(Object x) throws Exception {//出队
        Node p=new Node(x);//构造新节点
        if(front!=null){
            rear.next=p;
            rear=p;//后移一位
        }
        else{
            front=rear=p;
        }
    }

    @Override
    public Object poll() {
        if (front != null) {
            Node p=front;
            front=front.next;
            if(p==rear){
                rear=null;
            }
            return p.data;

        } else {
            return null;
        }
    }

    //测试
    public static void main(String[]args) throws Exception {
        LinkQueue linkQueue = new LinkQueue();
        System.out.println("队列是否为空："+linkQueue.isEmpty());
        System.out.println("连续入队-------------------------------");
        for(int i=0;i<5;i++){
            linkQueue.offer((char)(97+i));
        }
        System.out.println("队列长度为："+linkQueue.length());
        System.out.println("队首元素为："+linkQueue.peek());

        //出队
        System.out.println("连续出队-------------------------------");
        for(int i=0;i<4;i++){
            Object data=linkQueue.poll();
        }
        System.out.println("队列长度为："+linkQueue.length());
        System.out.println("队首元素为："+linkQueue.peek());
    }
}

class Node{
    public Object data;//节点值
    public Node next;//后继节点

    public Node(){
        this.data=null;
        this.next=null;

    }
    public Node(Object data){
        this.data=data;
        this.next=null;
    }
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
