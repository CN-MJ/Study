package HomeWork_1;

public class Circle extends Shapes{
    public Circle() {}
    public Circle(int i) {
        super(i);
    }
    @Override
    public int area() {
        return (int) (3.14*getI()*getI());
    }

    @Override
    public int circumference() {
        return (int) (2*3.14*getI());
    }
}
