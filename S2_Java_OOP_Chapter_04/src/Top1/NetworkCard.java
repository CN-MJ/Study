package Top1;

public class NetworkCard implements PCI {
    @Override
    public void Stop() {
        System.out.println("网卡开始");
    }

    @Override
    public void start() {
        System.out.println("网卡停止");
    }

}