package Top1;

public class SoundCard implements PCI{
    @Override
    public void Stop() {
        System.out.println("声卡发声");
    }

    @Override
    public void start() {
        System.out.println("停止发声");
    }
}
