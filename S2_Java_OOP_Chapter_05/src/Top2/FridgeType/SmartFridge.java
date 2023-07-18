package Top2.FridgeType;

import Top2.Fridge;
import Top2.api.Intelligent;
import Top2.api.Ordinary;

public class SmartFridge  extends Fridge implements Intelligent {

    public SmartFridge() {
        super("海尔", "BCD-330WD", 14);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
    }

    @Override
    public void MoveIngredients() {
        System.out.println("智能冰箱冷藏室正在通过气味自动将不新鲜的食材调动到距离冰箱门近的地方");
    }

    @Override
    public void Defrost(){
        System.out.println("智能冰箱冷藏室正在自动智能除霜!");

    }

    @Override
    public void ShowIngredients() {
        System.out.println(super.getBrand()+getModel()+"冰箱正在统计食材种类、保质期、根据用户偏好推荐食谱显示在大屏幕");
    }

    @Override
    public void ReplenishIngredients() {
        System.out.println(super.getBrand()+getModel()+"冰箱正在统计食材存量，并通知附近超市上门补货。");
    }

    @Override
    public void AutoSetFrozen(int Temp) {
        System.out.println(super.getBrand()+getModel()+"冰箱通过电脑温控系统将冷冻温度设定为"+Temp+"摄氏度");
    }

    @Override
    public void AutoSetRefrigeration(int Temp) {
        System.out.println(super.getBrand()+getModel()+"冰箱通过电脑温控系统将冷藏温度设定为"+Temp+"摄氏度");
    }

}
