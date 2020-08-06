package ResourceConflict;

import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/19
 */
public class BankAccount {

    /**
     * 账户id
     */
    private String id;

    /**
     * 余额
     */
    private Integer balance;

    /**
     * 是否有钱
     */
    private boolean flag = false;

    /**
     * 锁
     */
    private final ReentrantLock rq = new ReentrantLock();

    /**
     * Condition类
     */
    private final Condition con = rq.newCondition();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public BankAccount(String id, Integer balance) {
        this.id = id;
        this.balance = balance;
    }


    /**
     * ReentrantLock 可重入锁
     *
     * @param extra
     */
    public void drawMoney(Integer extra) {
        //开启锁
        rq.lock();
        try {
            if (extra > balance) {
                System.out.printf("余额不足!" + balance + "," + Thread.currentThread().getName() + "无法取钱");
            } else {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance = balance - extra;
                System.out.println(Thread.currentThread().getName() + "取了" + extra);
            }
        } finally {
            //释放锁
            rq.unlock();
        }

    }

    /**
     * 线程通信 存钱
     *
     * @param put
     */
    public synchronized void putMoneys(Integer put) {

        for (int i = 0; i < 10; i++) {

            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                balance += put;
                System.out.println(Thread.currentThread().getName() + "存入:" + put + "第" + i + "次");
                flag = true;
                notifyAll();
            }
        }
    }

    /**
     * 线程通信 取钱
     *
     * @param extra
     */
    public synchronized void drawMoneys(Integer extra) {

        for (int i = 0; i < 10; i++) {

            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                balance -= extra;
                System.out.println(Thread.currentThread().getName() + "取出:" + extra + "第" + i + "次");
                System.out.println("账户余额为：" + balance + "\n");
                flag = false;
                notifyAll();
            }
        }
    }


}
