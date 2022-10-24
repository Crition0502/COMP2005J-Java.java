package Week10.Queue.Interface;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 压入元素(添加)：add()、offer()
 * 相同：未超出容量，从队尾压入元素，返回压入的那个元素。
 * 区别：在超出容量时，add()方法会对抛出异常，offer()返回false
 *
 * 弹出元素(删除)：remove()、poll()
 * 相同：容量大于0的时候，删除并返回队头被删除的那个元素。
 * 区别：在容量为0的时候，remove()会抛出异常，poll()返回false
 *
 * 获取队头元素(不删除)：element()、peek()
 * 相同：容量大于0的时候，都返回队头元素。但是不删除。
 * 区别：容量为0的时候，element()会抛出异常，peek()返回null。
 */

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.offer("元素A");
        queue.offer("元素B");
        queue.offer("元素C");
        queue.offer("元素D");
        queue.offer("元素E");
        while (queue.size() > 0) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}


