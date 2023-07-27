import java.lang.Enum;


public class  EnumTest {
    public static void main(String[] args) {
        MyEnum_color red  = MyEnum_color.RED;
        System.out.println(red.getColor());
        System.out.println(MyEnum_color.GREEN.getColor());
        MyEnum_color.RED.printColor();
        MyEnum_color[] values = MyEnum_color.values();
        for (MyEnum_color en :values) {
            System.out.println(en);
        }
        System.out.println(MyEnum_color.valueOf("RED"));

    }
}
enum MyEnum_color{
    RED("红色", 1), GREEN("绿色", 2);
    private String Color;
    private int Num;


    public String getColor() {
        return Color;
    }

    MyEnum_color(String color, int num) {
        Color = color;
        Num = num;
    }
    public void printColor(){
        System.out.println("颜色是："+getColor());
    }
}