package Top4;

public interface Mover {
    default void mover(){
        System.out.println("我正在移动");
    }
}
