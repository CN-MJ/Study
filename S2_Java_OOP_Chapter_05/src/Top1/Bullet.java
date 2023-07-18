package Top1;

import Top1.Utils.UtilsRandom;
public class Bullet {
    private int hitHP = UtilsRandom.utilsRandom(1, 15);
     public int hitEnemy(){
         return hitHP;
    }

}
