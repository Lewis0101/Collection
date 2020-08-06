package collection1;

import java.util.Collection;

import ExceptionTest.NotFoundException;


/**
 * @author : LiuYang
 * @date : 2020/6/3
 */
public class ArrayListTest {



    public static void main(String[] args) {

        Collection<Integer> list = new java.util.ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("list-before:" + list);
        list.removeIf(ob -> ob > 5);

        System.out.println("list-end:" + list);
    }






}
