package Top1.Utils;

import java.util.Random;

public class UtilsRandom {
    public static int utilsRandom(int start, int end){
        Random random = new Random();

        return random.nextInt(end-start+1)+start;

    }

}
