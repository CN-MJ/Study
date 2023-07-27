import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Enum;

public class IOTest_02{
    public static void main(String[] args) throws IOException {
        String readPath = "C:\\Users\\Public\\Documents\\Code\\JavaCode\\S2_Java_OOP_chapter_09\\Test.txt";
        String writePath = "C:\\Users\\Public\\Documents\\Code\\JavaCode\\S2_Java_OOP_chapter_09\\TestCopy.txt";

        // 创建输出文件流
        FileInputStream inFile = null;
        // 创建输入文件流
        FileOutputStream outFile = null;

        // 创建缓冲流对象
        BufferedInputStream bufferedIn = null;
        BufferedOutputStream bufferedOut = null;
        
        
        try {

            inFile = new FileInputStream(readPath);

            outFile = new FileOutputStream(writePath);


            // 创建缓冲流对象
            bufferedIn = new BufferedInputStream(inFile);
            bufferedOut = new BufferedOutputStream(outFile);

            // 创建缓冲区
            byte[] cache = new byte[1024];

            int data;
            // 判断有没有数据如果有数据那么将数据复制进指定文件
            while ((data = bufferedIn.read(cache)) != -1) {
                bufferedOut.write(cache, 0, data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedIn != null) {
                bufferedIn.close();
            }
            if (bufferedOut != null) {
                bufferedOut.close();
            }
        }

    }
}