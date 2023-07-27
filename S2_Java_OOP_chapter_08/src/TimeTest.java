import java.util.Random;

public class TimeTest {
    public static void main(String[] args) {
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
//        System.out.println(DateTimeFormatter.ISO_DATE);
//        System.out.println(dateTimeFormatter.getLocale());
//        System.out.println(dateTime.format(dateTimeFormatter));
//        String s = dateTime.format(dateTimeFormatter);
        Random random = new Random(10);
        System.out.println(random.nextInt());

    }
}
