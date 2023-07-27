package Work.Utils;

import java.util.Random;

public class NumUtils {
    static Random random = new Random();
    public static String randomNum(){
        int randomNumber = random.nextInt(99999 - 10000 +1 )+10000;
        return "st"+ randomNumber;
    }
}
