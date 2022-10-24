package Week10.Queue;

public interface Queue {
    public void clear();//清空
    public boolean isEmpty();//判空
    public int length();//求长度
    public Object peek();//读队首元素
    public void offer(Object x)throws Exception;//插入元素
    public Object poll();//删除元素
}