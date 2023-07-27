package Top1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayInFo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 从控制台获取时间
        System.out.print("你的生日(yyyy-MM-dd)：");
        String birthday = scanner.next();

        // 格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 获取本地时间
        LocalDateTime now = LocalDateTime.now();

        // 将输入的时间转换
        LocalDateTime birth = LocalDate.parse(birthday, dtf).atStartOfDay();


        System.out.println("今天的日期：" + now.format(dtf));
        System.out.println("今年的生日：" + birthday);
        System.out.println("在一年中的天数：" + birth.getDayOfYear());
        System.out.println("当月的天数：" + birth.getDayOfMonth());
        System.out.println("星期：" + birth.getDayOfWeek());

    }
}
