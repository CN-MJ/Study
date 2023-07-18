package Top1;

public class Gun {
    private Clip clip = new Clip();
    public void shootEnemy(String name1, String name2){
        int sum;
        if (this.clip.getRemainder() > 1){
            this.clip.setRemainder(this.clip.getRemainder() -1);
            System.out.println(name1+"向"+name2+"射了一发");
        }else{
            System.out.println("没子弹了，换弹中");
            clip.pushBullet();
        }

    }
    public boolean showGun(){
        return true;
    }

    public Clip getClip() {
        return clip;
    }


}
