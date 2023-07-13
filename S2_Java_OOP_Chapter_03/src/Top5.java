public class Top5 {
    public static void main(String[] args) {
        Phones p =  new APhones();
        p.call();
        p = new IPhones();
        p.call();
        p = new WPhones();
        p.call();
    }


}
class Phones{
    public void call(){
        System.out.println();
    }

}
class APhones extends Phones{
    @Override
    public void call(){
        System.out.println("苹果手机");
    }
}
class IPhones extends Phones{
    @Override
    public void call(){
        System.out.println("安卓手机");
    }
}
class WPhones extends Phones{
    @Override
    public void call(){
        System.out.println("windows手机");
    }
}
