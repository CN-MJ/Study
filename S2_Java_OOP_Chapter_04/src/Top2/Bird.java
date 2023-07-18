package Top2;

import Top2.GameInterfacePackage.IEquipment;

public abstract class  Bird {
    /*
    * 鸟类的父类*/
    private IEquipment equipment;
    public Bird(){};
    public Bird(IEquipment iEquipment){
        this.equipment = iEquipment;
    }

    public void fly() {
        System.out.println("弹射飞");
    }
    public void show(){
        fly();
        twitter();
        attack();
    }

        public void twitter(){
        System.out.println("嗷嗷叫");
    }
    public abstract void attack();

    public IEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(IEquipment equipment) {
        this.equipment = equipment;
    }
}
