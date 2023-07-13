package Farm;

public class AppleTree extends Crop{
    public AppleTree(){
        setName("苹果树");
        setGrowTime(10);
        setStatus("生长期");
        setHarvestTime(2);
        setNumsOfFruits(100);
    }
    public void print() {
        System.out.println("作物信息");
        System.out.print("你种植了：" + getName()+
                ",生长时间为：" + getGrowTime() +"天"+
                "，采摘期为：" + getHarvestTime()+
                "，果实数量为 ：" + getNumsOfFruits()+
                "，现处于："+getStatus());

        System.out.println("，属于水果作物，品种："+getBrand());
    }

    public boolean isHarvested; // 收获状态


    @Override
    public void setName(String name) {
        super.setName("苹果树");
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setGrowTime(int growTime) {
        super.setGrowTime(10);
    }

    @Override
    public void setHarvestTime(int harvestTime) {
        super.setHarvestTime(2);
    }

    @Override
    public void setNumsOfFruits(int numsOfFruits) {
        super.setNumsOfFruits(100);
    }

    @Override
    public void setStatus(String status) {
        super.setStatus("生长其");
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
