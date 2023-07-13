package HomeWork_1;

public class Test {
    public static void main(String[] args) {
        Shapes shapes_1 = new Rectangle(4, 5);
        System.out.println(shapes_1.circumference());
        System.out.println(shapes_1.area());
        Shapes shapes_2 = new Circle(4);
        System.out.println(shapes_2.circumference());
        System.out.println(shapes_2.area());
        Shapes shapes_3 = new Triagle(4, 5, 6);
        System.out.println(shapes_3.circumference());
    }
}
