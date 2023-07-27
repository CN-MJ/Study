package Top2;

import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("你要票吗（50/张）");
            int i = scanner.nextInt();
            if (i <= 50) {
                throw new payException("你没钱");
            }
        }catch(payException e){
            e.printStackTrace();
        }finally{
            System.out.println("你没钱");
        }
    }
}
class payException extends Exception{
    public payException(){
        super();
    }
    public payException(String message) throws payException{
        super(message);
    }
}