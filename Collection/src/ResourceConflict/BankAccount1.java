package ResourceConflict;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/19
 */
public class BankAccount1 {

    /**
     * 账户id
     */
    private String id;

    /**
     * 余额
     */
    volatile private  Integer balance;


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

    public BankAccount1(String id, Integer balance) {
        this.id = id;
        this.balance = balance;
    }



}
