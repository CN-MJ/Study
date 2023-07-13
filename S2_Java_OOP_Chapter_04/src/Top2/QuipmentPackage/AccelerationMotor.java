package Top2.QuipmentPackage;

import Top2.GameInterfacePackage.IEquipment;

public class AccelerationMotor  implements IEquipment {
    @Override
    public String getName() {
        return "加速马达";
    }

    @Override
    public void show() {
        System.out.println("加速冲锋");
    }
}
