package HomeWork_1;

public class Triagle extends Shapes {
    public Triagle() {}
    public Triagle(int i, int j, int x) {
        super(i, j, x);
    }

    @Override
    public int circumference() {
        return getI()+ getJ()+ getX();
    }
}
