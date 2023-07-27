
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IOTest_01 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Public\\Documents\\Code\\S2_Java_OOP_chapter_09\\Test.txt";
        File file_1 = new File(path);
        System.out.println(file_1.getAbsoluteFile()); // 文件绝对路径
        System.out.println(file_1.getParentFile()); // 指定文件或文件夹的上一级
        System.out.println(file_1.length());
        System.out.println(file_1.isDirectory()); // 判断是否为目录
        System.out.println(file_1.isFile()); // 判断是否为文件
        System.out.println(file_1.exists()); // 判断是存在关联

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置日期格式

        // 最后修改时间
        Date date = new Date(file_1.lastModified()); // 获取时间
        System.out.println(simpleDateFormat.format(date)); // 将获取的时间格式化后输出

        System.out.println(file_1.getAbsoluteFile());
        String[] list = file_1.list();
        for (String str: list
             ) {
            System.out.println(str);
        }

//        String absolutePath = "C:\\Users\\Public\\Documents\\Code\\S2_Java_OOP_chapter_09\\Test.txt";
//
//        File file_2 = new File(absolutePath);
//        boolean newFile = file_2.createNewFile();
//        System.out.println(newFile);



    }
}