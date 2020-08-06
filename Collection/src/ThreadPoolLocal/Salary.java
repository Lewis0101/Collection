package ThreadPoolLocal;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/7/8
 */
public class Salary {
    public static void main(String[] args) {
        double x = 0;
        for (int i = 0; i < 30; i++) {
            x = x+12000;
            x = x + x * 0.12;
            System.out.println("第"+(i+1)+"年总金额为："+ x);
        }
        System.out.println(x);
    }
}
