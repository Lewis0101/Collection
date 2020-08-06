package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author : LiuYang[1005859278@qq.com]
 * @date : 2020/6/17
 */
public class Input {
    public static void main(String[] args) {

//        try (FileInputStream inputStream = new FileInputStream("H:\\00222\\Collection\\src\\FileIO\\FileName.java")) {
//
//            //创建输出流
//            FileOutputStream outputStream = new FileOutputStream("new.txt");
//            byte[] b = new byte[1024];
//            int hasNext = 0;
//
//            while ((hasNext = inputStream.read(b)) > 0) {
//                outputStream.write(b);
//                outputStream.write(b, 0, hasNext);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        /**
//         * 读取图片
//         */
//        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\10058\\Desktop\\工作\\截图\\consumer.png");
//             FileOutputStream outputStream = new FileOutputStream("1.png")) {
//
//            byte[] bytes = new byte[1024];
//            int hasNext = 0;
//            while ((hasNext = inputStream.read(bytes)) > 0) {
//                outputStream.write(bytes, 0, hasNext);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\10058\\Desktop\\工作\\截图\\consumer.png"));
//             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("2.png"))){
//
//            byte[] bytes = new byte[1024];
//            int hasNext = 0;
//            while ((hasNext = bufferedInputStream.read(bytes)) > 0) {
//                outputStream.write(bytes, 0, hasNext);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        File file  = new File("H:\\00222\\Collection");
//        System.out.println(file.list());
//
//        try (BufferedReader br = new BufferedReader(new FileReader("new.txt"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("pom1.txt"))){
//
//            String str = null;
//
//            while ((str = br.readLine()) != null){
//                System.out.println(str);
//                writer.write(str+"\n");
//            }
//
//        }catch (IOException e ){
//            e.printStackTrace();
//        }

        /**
         * Url下载图片
         */
        try {
            URL  url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1592568957109&di=efa0092e410bcf3664ee9336eb8ab4e0&imgtype=0&src=http%3A%2F%2Fm.360buyimg.com%2Fn12%2Fjfs%2Ft2113%2F191%2F2983497200%2F604570%2F3a8cf29b%2F56fa14f2Nf13de55f.jpg%2521q70.jpg");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setRequestMethod("GET");
            InputStream inputStream = urlConnection.getInputStream();

            FileOutputStream outputStream = new FileOutputStream("c.jpg");

            byte[] buff = new byte[4096];
            int len = 0;

            while ((len = inputStream.read(buff)) != 0){
                outputStream.write(buff,0,len);
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
