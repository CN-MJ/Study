package Top2;

public class Fridge {

    private String brand; // 品牌
    private String model; // 型号
    private int temp;// 温度

    public Fridge(String brand, String model, int temp) {

        this.brand = brand;
        this.model = model;
        this.temp = temp;

    }

    public void ShowInfo(){
        System.out.println("这是一款型号为"+brand+"的"+model+"冰箱");
    }
    public String getBrand() {
        return brand;
    }

    public int getTemp() {
        return temp;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
