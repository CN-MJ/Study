package Top2.BirdClassPackage;
import Top2.Bird;
import Top2.QuipmentPackage.Bomb;

public class BombBird extends Bird {
    /*
    * 炸弹鸟*/
    public BombBird(){
        super(new Bomb());
    }

    @Override
    public void attack() {
        System.out.println("炸弹鸟攻击");
        this.getEquipment().show();
    }

}
