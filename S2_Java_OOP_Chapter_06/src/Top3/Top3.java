package Top3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Top3 {
    private static final Logger logger= LogManager.getLogger();

    public static void main(String[] args) {
        try{
            int[] i = new int[2];
            i[0] = 1;
            i[1] = 2;
            for (int j = 0; j <=i.length ; j++) {
                System.out.println(i[j]);
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            logger.error("数组越界");
        }finally {
            System.out.println("默认加载");
        }
    }
}
