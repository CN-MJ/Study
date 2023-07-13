public class Cart {
    private int length; // 长度
    private double price;// 金额
    private String numberPlate;// 车牌
    public Cart(int length, String numberPlate){

    }

    public void print(){
        System.out.println("车牌号为："+getNumberPlate());
        System.out.println("车身长度为："+getLength());
    }
    public void getRate(){}

    public double  getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
