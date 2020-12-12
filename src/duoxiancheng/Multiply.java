package duoxiancheng;

import java.util.Scanner;

public class Multiply implements Runnable {
    private Sum sum;
    private long fromInt;
    private long toInt;
    private long x;

    public Multiply(Sum sum, long fromInt, long toInt, long x) {
        this.sum = sum;
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.x = x;
    }

    private static boolean contain(long num, long x){
        return String.valueOf(num).contains(String.valueOf(x));
    }

    @Override
    public void run() {
        for (long i = fromInt; i <= toInt; i++) {
            if(contain(i, x))
                this.sum.value += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long toMax = 1000000000; // 从1到1000000000查找满足需求的数字
        long sum = 0;
        int threads = 100000; // 线程数
        // 每个线程计算一段连续的加和，并将加和结果保存在数组中。
        Sum[] subSum = new Sum[threads];
        System.out.println("请输入x：");
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();

        for (int i = 0; i < threads; i++) {
            subSum[i] = new Sum(0);
        }
        for (int i = 0; i < threads; i++) {
            long fromInt = toMax * i / threads + 1; // 边界条件
            long toInt = toMax * (i + 1) / threads; // 边界条件
            new Thread(new Multiply(subSum[i], fromInt, toInt, x)).start();
        }
        for (int i = 0; i < threads; i++) {
            sum += subSum[i].value;
        }
        System.out.println("The sum is :" + sum);
    }

}
