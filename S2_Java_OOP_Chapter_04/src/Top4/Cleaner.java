package Top4;

public interface Cleaner {
    default void cleaner(){
        System.out.println("正在吸尘");
    }
}
