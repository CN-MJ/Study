package Top2.BirdClassPackage;

import Top2.Bird;
import Top2.GameInterfacePackage.ISplit;
import Top2.QuipmentPackage.FlameThrower;

public class FlameSplitBird  extends Bird implements ISplit{
    /*
    * 喷火分裂鸟*/
    public FlameSplitBird(){
        super(new FlameThrower());
    }


    @Override
    public void attack() {
        System.out.println("喷火分裂鸟攻击：");
        this.split();
        this.getEquipment().show();

    }

}
