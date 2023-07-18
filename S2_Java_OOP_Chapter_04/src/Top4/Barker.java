package Top4;

public interface Barker {
    default void barker(){
        System.out.println("正在狗叫");
    }
}
