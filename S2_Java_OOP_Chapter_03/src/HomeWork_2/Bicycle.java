package HomeWork_2;

public class Bicycle extends Cart {

    public Bicycle(){
        super("黄色", "安特");
    }

    @Override
    public void show() {
        System.out.println("自行车类信息测试: 这是一辆"+getColor()+"颜色的车"+getBrand()+"牌的自行车");
    }
}
