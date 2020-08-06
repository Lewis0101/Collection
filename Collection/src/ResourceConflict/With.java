package ResourceConflict;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.Spring;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/19
 */
public class With {


    public static void main(String[] args) {

//        BankAccount1 bankAccount = new BankAccount1("500109",1000);
        BankAccount bankAccount = new BankAccount("500109",1000);

        //A某
        WithdrawThread withdrawThread = new WithdrawThread("A",bankAccount,800);

        //B某
        WithdrawThread withdrawThread1 = new WithdrawThread("B",bankAccount,800);

        withdrawThread.start();
        withdrawThread1.start();


//        WithdrawThread put = new WithdrawThread("刘某",bankAccount,800);
//        getdrawThread get = new getdrawThread("李某",bankAccount,800);
//
//        put.start();
//        get.start();

//        WithdrawThreadVio vio = new WithdrawThreadVio("刘某",bankAccount,800);
//        WithdrawThreadVio vio1 = new WithdrawThreadVio("张某",bankAccount,800);
//        vio.start();
//        vio1.start();



    }
}