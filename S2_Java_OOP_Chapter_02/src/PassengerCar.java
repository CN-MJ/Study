public class PassengerCar extends Cart{
    public PassengerCar(){
        super(5000, "京BK2139K");
    }
    private int  number = 8;// 人数

    @Override
    public void print() {
        super.print();
        System.out.println("何在人数为" + number);
    }

    @Override
    public void getRate() {
        super.getRate();
        if ((getLength()<6000 && number< 9) || (getLength()) < 6000 ||(number>10 || number<19)){
            setPrice(0.6);
        }
        System.out.println("您的车辆需缴费");
    }
}
