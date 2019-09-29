package C202_05_01泛型;

import java.util.Objects;

public class Queue<T> {
    private int front;//队首
    private int rear;//队尾
    private int capacity;//队列容量
    private T[] data;//存储数据的空间

    /**
     * 初始化
     *
     * @param capacity 队列容量
     */
    public Queue(int capacity) {
        this.front = 0;
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.rear = 0;
    }

    /**
     * 判断队列是否为空
     *
     * @return true-是；false-不是
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 判断队列是否为满
     *
     * @return true-是；false-不是
     */
    public boolean isPull() {
        return front == (rear + 1) % capacity;
    }

    /**
     * 入队
     *
     * @param d 要存储的数据
     * @return true-入队成功；false-入队失败
     */
    public boolean push(T d) {
        if (isPull()) {
            return false;
        }

        data[rear] = d;
        rear = (rear + 1) % capacity;
        return true;
    }

    /**
     * 出队
     *
     * @return 出队的数据, 若出队失败则返回空null
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T d = data[front];
        front = (front + 1) % capacity;
        return d;
    }

    @Override
    public String toString() {
        String s = "[";
        int i = front;
        while (i != rear) {
            s += data[i]+" ";
            i = (i + 1) % capacity;
        }
        s += "]";
        return s;
    }
}
