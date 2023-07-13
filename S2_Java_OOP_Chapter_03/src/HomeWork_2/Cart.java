package HomeWork_2;

public class Cart {
    public Cart(){
        this.color = "红色";
        this.brand = "天宇";
        this.wheel = 4;
        this.seat = 2;
    }
    public Cart(String color, String brand){
        this.color = color;
        this.brand = brand;
    }
    public Cart(String brand){
        this.brand = brand;
    }
    public Cart(int seat){
        this.seat = seat;
    }

    private String color;
    private String brand;
    private int wheel;
    private int seat;

    public int getSeat() {
        return seat;
    }

    public void show(){
        System.out.println("父类信息测试: 这是一辆"+getColor()+"颜色的，"+getBrand()+"牌的非机动车，有"+getWheel()+"个轮子，有"+getSeat()+"个座椅");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
