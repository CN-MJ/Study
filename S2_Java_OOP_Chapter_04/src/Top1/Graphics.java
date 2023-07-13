package Top1;

public class Graphics implements PCI {
    @Override
    public void Stop() {
        System.out.println("显卡显示");
    }

    @Override
    public void start() {
        System.out.println("显卡停止显示");
    }

    @Override
    public void print() {
        PCI.super.print();
    }
}
