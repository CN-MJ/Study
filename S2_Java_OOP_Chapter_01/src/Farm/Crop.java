package Farm;

public class Crop {
    private String name; // 名称
    private String brand;// 品种
    private int growTime; // 生长时间
    private int harvestTime; // 收获时间
    private int numsOfFruits; // 水果数量
    private String status; // 生长状态
    boolean IsHarvested; // 是否采摘

    public int getNumsOfFruits() {
        return numsOfFruits;
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public String getStatus() {
        return status;
    }

    public int getGrowTime() {
        return growTime;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getIsHarvested() {
        return IsHarvested;
    }

    public void setIsHarvested(boolean IsHarvested) {
        this.IsHarvested = IsHarvested;
    }

    public void setGrowTime(int growTime) {
        this.growTime = growTime;
    }

    public void setHarvestTime(int harvestTime) {
        this.harvestTime = harvestTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumsOfFruits(int numsOfFruits) {
        this.numsOfFruits = numsOfFruits;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
