package ch.ljh.qm;


import java.util.concurrent.atomic.LongAdder;

public class LongAdderExample {

    public static void main(String[] args) {
        LongAdder adder = new LongAdder();

        // 添加多个值
        adder.add(10);
        adder.add(20);
        adder.add(30);

        // 获取当前累加结果
        long sum = adder.sum();
        System.out.println("Sum: " + sum);

        // 重置累加器
        adder.reset();

        // 检查当前累加结果
        sum = adder.sum();
        System.out.println("Reset Sum: " + sum);
    }
}
