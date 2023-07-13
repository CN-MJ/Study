package Top2.BirdClassPackage;

import Top2.Bird;
import Top2.QuipmentPackage.SpinEngine;

public class SpinBird extends Bird{
    /*
    * 旋转鸟
    * */
    public SpinBird(){
        super(new SpinEngine());
    }

    @Override
    public void attack() {
        System.out.println("旋转鸟攻击");
        this.getEquipment().show();
    }

}
