package HomeWork_1;

public abstract class Shapes {
    public Shapes() {

    }

    public Shapes(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Shapes(int i, int j, int x) {
        this.i = i;
        this.j = j;
        this.x = x;
    }

    public Shapes(int i) {
        this.i = i;
    }

    private int i;
    private int j;
    private int x;

    public int area(){ return 0;};

    public abstract int circumference();


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getX() {
        return x;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
