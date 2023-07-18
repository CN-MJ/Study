package Top4;

public class CookRobot extends Robot implements Mover, Cooker{


    @Override
    public void startToWork() {
        System.out.println("启动");
        mover();
        cooker();
        stop();
    }
}
