package Multithreading_xiaoMing;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.*;
public class Addnum {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
        ForkJoinTask<Long> task = new SumTask( 1, 1000000000,x);
        Long result = ForkJoinPool.commonPool().invoke(task);
        System.out.println(result);
    }
}

class SumTask extends RecursiveTask<Long> {
    static final int THRESHOLD = 70 ;
    int start;
    int end;
    int x;
    private static boolean contain(long num, int x) {
        return String.valueOf(num).contains(String.valueOf(x));
    }
    SumTask(int start, int end, int x) {
        this.start = start;
        this.end = end;
        this.x= x;
    }
    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // 如果任务足够小,直接计算:
            long sum = 0;
            for (int i = start; i <end; i++) {
                if (contain(i, x)) sum += i;
                // 故意放慢计算 速度:
            }
            return sum;
        }
        // 任务太大,一分为二:
        int middle = (end + start) / 2;
        SumTask subtask1 = new SumTask( start, middle,x);
        SumTask subtask2 = new SumTask( middle, end,x);
        invokeAll(subtask1, subtask2);
        Long subresult1 = subtask1.join();
        Long subresult2 = subtask2.join();
        Long result = subresult1 + subresult2;
        return result;
    }
}



