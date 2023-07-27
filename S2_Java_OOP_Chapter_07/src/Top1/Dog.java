package Top1;

public class Dog {
    public Dog() {
    }

    public Dog(String name, String variety) {
        this.name = name;
        this.variety = variety;
    }

    private String name;
    private String variety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
