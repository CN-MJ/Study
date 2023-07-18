package Top1;

public class Player {
    private Gun gun = new Gun();
    private String name;
    private int hp = 100;

    public boolean holdGun(){
        return true;
    }
    public void loadClip(){
        gun.getClip().pushBullet();
    }
    public void damage(){
        int s = gun.getClip().getBullet()[gun.getClip().getRemainder()].hitEnemy();
        this.hp -= s;
    }
    public void shootEnemy(String name1, String name2){
        if (gun.getClip().getRemainder()>0) {
            gun.shootEnemy(name1, name2);
            damage();
        }else {
            System.out.println("打了发空枪");
        }
    }
    public void showPlayer(){
        System.out.println("玩家信息:姓名="+name+"，血量="+getHp()+"，是否持枪"+holdGun());
    }


    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Math.max(0, hp);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
