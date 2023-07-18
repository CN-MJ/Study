package Top1;

public class Clip {
    public Clip(){
        bullet = new Bullet[magazine];
        for (int i = 0; i < bullet.length; i++) {
            bullet[i] = new Bullet();
        }
    }
    public Bullet[] bullet;
    private int magazine = 30;
    private int remainder =30;


    public void pushBullet() {
        this.remainder = this.magazine;
    }
    public void popBullet() { this.remainder = 0; }
    public void ShowClip(){
        System.out.println("弹夹剩余"+remainder+"/"+ magazine);
    }

    public int getMagazine() {
        return magazine;
    }

    public Bullet[] getBullet() {
        return bullet;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }
}
