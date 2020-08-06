package ResourceConflict;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/19
 */
public class WithdrawThread extends Thread {

    /**
     * 所取账户
     */
    private  BankAccount mBankAccount;

    /**
     * 取钱金额
     */
    private Integer withDraw;

    public WithdrawThread(String name, BankAccount bankAccount, Integer withDraw) {
        super(name);
        mBankAccount = bankAccount;
        this.withDraw = withDraw;
    }

    public WithdrawThread() {
    }

    @Override
    public void run() {

        synchronized (mBankAccount){
            if (mBankAccount.getBalance() > withDraw) {
                System.out.println(getName() + "取钱 " + withDraw);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                mBankAccount.setBalance(mBankAccount.getBalance() - withDraw);
                System.out.println("账户余额为：" + mBankAccount.getBalance());
            } else {
                System.out.println("账户余额不足" + getName() + "无法取钱！");
            }
        }

        if (mBankAccount.getBalance() > withDraw) {
            System.out.println(getName() + "取钱 " + withDraw);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mBankAccount.setBalance(mBankAccount.getBalance() - withDraw);
            System.out.println("账户余额为：" + mBankAccount.getBalance());
        } else {
            System.out.println("账户余额不足" + getName() + "无法取钱！");
        }

        mBankAccount.drawMoney(withDraw);
//        mBankAccount.putMoneys(withDraw);
    }


}
