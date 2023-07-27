import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsTest_01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 时间格式
        String format = simpleDateFormat.format(date); // 将时间转换
        System.out.println(format); // 输出时间


        String dateStu = "2077-12-12";
        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse(dateStu);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date1);

        System.out.println(date1.before(date));
        System.out.println(date1.after(date));



    }
}