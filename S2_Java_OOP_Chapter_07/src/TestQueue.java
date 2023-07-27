import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        System.out.println(arrayBlockingQueue.offer("asdf"));

        System.out.println(arrayBlockingQueue);
        try {
            System.out.println(arrayBlockingQueue.take());
            System.out.println(arrayBlockingQueue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
