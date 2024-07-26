package ch.ljh.qm.queue;

public class MyQueue {
    private int[] arr; // 用户存储队列元素的数组
    private int front; // 队首指针
    private int rear; // 队尾指针
    private int size; // 队列当前元素个数
    private int capacity; // 队列容量

    // 构造方法，初始化队列
    public MyQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // 检查队列是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 检查队列是否已满
    public boolean isFull(){
        return size == capacity;
    }

    // 入队操作
    public void enqueue(int value){
        if (isFull()){
            throw new IllegalStateException("Queue is Empty");
        }
        rear = (rear +1) % capacity;
        arr[rear] = value;
        size ++;
    }

    // 出队操作
    public int dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size --;
        return value;
    }

    // 获取队列大小
    public int getSize(){
        return size;
    }

    //  查看队首元素
    public int peek(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return arr[front];
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        // 入队操作
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // 查看队首元素
        System.out.println("Front element: " + queue.peek());

        // 出队操作
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Dequeue element: " + queue.dequeue());

        // 查看队首元素
        System.out.println("Front element: " + queue.peek());

        // 检查队列是否为空
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 获取队列的大小
        System.out.println("Queue size: " + queue.getSize());
    }

}
