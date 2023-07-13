package Top2.BirdClassPackage;

import Top2.Bird;
import Top2.GameInterfacePackage.*;
import Top2.QuipmentPackage.AccelerationMotor;

public class SuperBird  extends Bird implements ISplit,ISwell{
    /*
    * 超级鸟*/
    public SuperBird(){
        super(new AccelerationMotor());
    }

    @Override
    public void attack() {
        System.out.println("超级鸟攻击");
        this.fly();
        this.swell();
        this.getEquipment().show();
    }

}
