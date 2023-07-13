package Top1;

public interface PCI {
    void start();
    void Stop();
    default void print(){
        System.out.println("符合PCI插槽标准");
    }
}
