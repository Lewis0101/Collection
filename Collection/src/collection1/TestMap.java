package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/15
 */
public class TestMap {
    public static void main(String[] args) throws RuntimeException {

        Map<Integer, Integer> mapHash = new HashMap<>();
        Map<Integer, Integer> mapHash1 = new HashMap<>();

        Map<Integer, Integer> mapLinkedHash = new LinkedHashMap<>();

        for (int i = 0; i < 100; i++) {
            mapHash.put(i, i);
        }
        for (int i = 0; i < 100; i++) {
            mapHash1.put(i, i);
        }
        for (int i = 0; i < 100; i++) {
            mapLinkedHash.put(i, i);
        }

        mapHash.forEach((key, value) -> System.out.println("key:" + key + "-" + "value:" + value));
        System.out.println("\n");
        mapHash1.forEach((key, value) -> System.out.println("key:" + key + "-" + "value:" + value));
        System.out.println("\n");
        mapLinkedHash.forEach((key, value) -> System.out.println("key:" + key + "-" + "value:" + value));

        List<String> list = new ArrayList<>();

        getNull(list);

    }

    public static void getNull(List<String> list) throws NullPointerException {
        for (String req : list
        ) {
            System.out.println(req);
        }
    }

}
