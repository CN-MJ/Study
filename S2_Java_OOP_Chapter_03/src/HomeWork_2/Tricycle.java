package HomeWork_2;

public class Tricycle extends Cart {
    public Tricycle(){
        super(3);
    }

    @Override
    public void show() {
        System.out.println("三轮车类信息测试: 这是一辆有"+getSeat()+"个轮子的三轮车车");
    }
}
