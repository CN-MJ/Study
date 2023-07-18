package Top4;

public class Test {
    static void print(Robot robot){
        robot.startToWork();
    }
    public static void main(String[] args) {
        Robot robot = new  DogRobot();
        print(robot);
        robot = new CookRobot();
        print(robot);
        robot = new CleanRobot();
        print(robot);
        robot = new SuperRobot();
        print(robot);

    }
}
