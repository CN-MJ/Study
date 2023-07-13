package Top2.QuipmentPackage;

import Top2.GameInterfacePackage.IEquipment;

public class SpinEngine implements IEquipment {
    @Override
    public String getName() {
        return "旋转引擎";
    }

    @Override
    public void show() {
        System.out.println("使用哦"+this.getName()+"旋转攻击");
    }
}
