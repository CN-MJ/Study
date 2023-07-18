package Top4;

public interface Cooker {
    default void cooker(){
        System.out.println("正在做饭");
    }
}
