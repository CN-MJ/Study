package Top1;

public class Test {
    public static void test(PCI pci){
        pci.print();
        pci.start();
        pci.Stop();

    }
    public static void main(String[] args) {
        PCI graphics = new Graphics();
        test(graphics);
        PCI soundCard = new SoundCard();
        test(soundCard);
        PCI networkCard = new NetworkCard();
        test(networkCard);

    }
}
