package Top3;

public class Printer{
    InkBox inkBox;
    Parer parer;

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public void setParer(Parer parer) {
        this.parer = parer;
    }
    public void print(){
        System.out.println("使用"+ inkBox.getColor()+"墨盒在"+parer.getSize()+"上打印");
    }
}
