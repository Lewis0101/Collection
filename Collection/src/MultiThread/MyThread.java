package MultiThread;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/18
 */
public class MyThread extends Thread {

    private int i;

    //执行线程功能的线程体
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() +" "+ i);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            System.out.println(Thread.currentThread().getName() + i);
            if (i == 10) {
                new MyThread().run();
                new MyThread().run();
            }
        }
    }
}
