package Top4;

public class CleanRobot extends Robot implements Mover,Cleaner{
    @Override
    public void startToWork() {
        System.out.println("启动");
        mover();
        cleaner();
        stop();
    }
}
