package Top3;

public class Test {

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        printer1.setParer(new A4Paper());
        printer1.setInkBox(new GraInkBox());
        printer1.print();
        Printer printer2 = new Printer();
        printer2.setParer(new A5Paper());
        printer2.setInkBox(new GraInkBox());
        printer2.print();
        Printer printer3 = new Printer();
        printer3.setParer(new A4Paper());
        printer3.setInkBox(new ColorInkBox());
        printer3.print();

    }
}
