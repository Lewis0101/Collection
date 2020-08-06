package FileIO;

import java.io.File;
import java.io.IOException;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/16
 */
public class FileName {
    public static void main(String[] args)  throws IOException {
        File file = new File("H:\\V2RayW");
        File[] files = file.listFiles();
        System.out.println(files);
    }
}
