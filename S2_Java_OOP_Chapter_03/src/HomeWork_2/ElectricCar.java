package HomeWork_2;

public class ElectricCar extends Cart {
    public ElectricCar(){
        super("安特");
    }

    @Override
    public void show() {
        System.out.println("电动车类信息测试: 这是一辆"+getBrand()+"牌电池的电动车");
    }
}
