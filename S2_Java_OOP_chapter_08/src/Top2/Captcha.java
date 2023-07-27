package Top2;


import java.util.Random;

public class Captcha {
    static Random random  = new Random();
    public static void main(String[] args) {
        System.out.println("五位数字验证码：");
        for (int i = 0; i < 5; i++) {
            System.out.print(NumberCaptcha()+"\t");
        }
        System.out.println("\n五位字母验证码：");
        for (int i = 0; i < 5; i++) {
            System.out.print((char) LetterCaptcha()+"\t");
        }
    }
    public static int NumberCaptcha(){
        return random.nextInt(10);
    }
    public static int LetterCaptcha(){
        return random.nextInt(26)+65;
    }
}
