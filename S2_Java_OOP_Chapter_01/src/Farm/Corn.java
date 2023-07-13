package Farm;

public class Corn extends Crop {
    double harvestCost; // 收割费用

    public Corn(){
        setName("玉米");
        setGrowTime(8);
        setStatus("生长期");
        setHarvestTime(3);
        setNumsOfFruits(200);
    }
    public void print() {
        System.out.println("作物信息");
        System.out.print("你种植了：" + getName() +
                ",生长时间为：" + getGrowTime() + "天" +
                "，采摘期为：" + getHarvestTime() +
                "，果实数量为：" + getNumsOfFruits() +
                "，现处于：" + getStatus());

        System.out.println("，属于农作物，收割费用为：" + harvestCost + "元");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setGrowTime(int growTime) {
        super.setGrowTime(growTime);
    }

    @Override
    public void setHarvestTime(int harvestTime) {
        super.setHarvestTime(harvestTime);
    }

    @Override
    public void setNumsOfFruits(int numsOfFruits) {
        super.setNumsOfFruits(numsOfFruits);
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public boolean getIsHarvested() {
        return super.getIsHarvested();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getGrowTime() {
        return super.getGrowTime();
    }

    @Override
    public int getHarvestTime() {
        return super.getHarvestTime();
    }

    @Override
    public int getNumsOfFruits() {
        return super.getNumsOfFruits();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }
}
