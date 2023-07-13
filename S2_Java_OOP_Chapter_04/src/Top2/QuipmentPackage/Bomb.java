package Top2.QuipmentPackage;

import Top2.GameInterfacePackage.IEquipment;

public class Bomb implements IEquipment {
    @Override
    public String getName() {
        return "炸弹";
    }

    @Override
    public void show() {
        System.out.println(this.getName()+"爆炸攻击");
    }
}
