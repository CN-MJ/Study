package Top2.QuipmentPackage;

import Top2.GameInterfacePackage.IEquipment;

public class FlameThrower  implements IEquipment {
    @Override
    public String getName() {
        return "喷火器";
    }

    @Override
    public void show() {
        System.out.println("使用"+this.getName()+"喷射攻击");
    }
}
