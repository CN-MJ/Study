package Top4;

public class SuperRobot  extends Robot implements Mover, Cleaner, Cooker, Barker{

    @Override
    public void startToWork() {
        System.out.println("启动");
        mover();
        barker();
        cleaner();
        cooker();
        stop();
    }
}
