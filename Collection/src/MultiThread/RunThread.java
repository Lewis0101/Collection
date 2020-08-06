package MultiThread;

import com.sun.javafx.collections.MappingChange;

import java.util.Map;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/18
 */
public class RunThread implements Runnable {
    //共享变量
    private int i;

    @Override
    public void run() {
        for (; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                RunThread runThread = new RunThread();
//        new Thread(new RunThread(),"线程1").start();
//        new Thread(new RunThread(),"线程2").start();
                Thread thread = new Thread(runThread, "线程1");
                Thread thread1 = new Thread(runThread, "线程2");

                thread.setPriority(Thread.MAX_PRIORITY);
            }

        }
    }
}
