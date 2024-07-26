package ch.ljh.qm.stack;

public class MyStack {
    private int[] arr;  // 用户存储栈元素的数组
    private int top;    // 栈顶指针
    private int capacity;   // 栈的容量

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    // 检查栈是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    // 检查栈是否已满
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 入栈操作
    public void push(int value){
        if (isFull()){
            throw new IllegalStateException("Stack is full");
        }
        arr[++top] = value;
    }

    // 出栈操作
    public int pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return arr[top--];
    }

    //  获取栈顶元素
    public int peek(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return arr[top];
    }

    // 获取栈的大小
    public int getSize() {
        return top + 1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        // 入栈操作
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // 查看栈顶元素
        System.out.println("Top element: " + stack.peek());

        // 出栈操作
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());

        // 查看栈顶元素
        System.out.println("Top element: " + stack.peek());

        // 出栈操作
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());

        // 检查栈是否为空
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 获取栈的大小
        System.out.println("Stack size: " + stack.getSize());
    }
}
