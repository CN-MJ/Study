package Top2.FridgeType;

import Top2.Fridge;
import Top2.api.Intelligent;
import Top2.api.Ordinary;

public class RegularFridge extends Fridge  implements Ordinary {

    public RegularFridge() {
        super("西门子", "BCD-160w", 14);
    }

    @Override
    public void refrigeration(int temp1,int temp2) {
        System.out.println("普通冰箱冷藏温度设定为"+temp1+"~"+temp2+"摄氏度。");
    }
    @Override
    public void frozen(int temp1,int temp2) {
        System.out.println("普通冰箱冷冻温度设定为"+temp1+"~"+temp2+"摄氏度。");
    }
    @Override
    public void manualSetRefrigeration(int temp) {
        System.out.println("通过手动调整温度转盘将"+getBrand()+getModel()+"冰箱冷冻温度设定为"+temp+"摄氏度");
    }
    @Override
    public void manualSetFrozen(int temp) {
        System.out.println("通过手动调整温度转盘将"+getBrand()+getModel()+"冰箱冷藏温度设定为"+temp+"摄氏度");
    }
}
