package HomeWork_1;

public class Rectangle extends Shapes{

    public Rectangle(){}
    public Rectangle(int i, int j){
        super(i, j);
    }

    @Override
    public int area() {
        return getI() * getJ();
    }

    @Override
    public int circumference() {
        return (getI() + getJ())*2;
    }
}
