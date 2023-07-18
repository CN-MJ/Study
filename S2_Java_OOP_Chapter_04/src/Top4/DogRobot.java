package Top4;

public class DogRobot extends Robot implements Mover, Barker{
    @Override
    public void startToWork() {
        System.out.println("启动");
        mover();
        barker();
        stop();
    }
}
