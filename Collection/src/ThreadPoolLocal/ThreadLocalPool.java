package ThreadPoolLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

import MultiThread.MyThread;
import MultiThread.RunThread;

/**
 * @desc : 线程池
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/29
 */
public class ThreadLocalPool {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new RunThread());
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
