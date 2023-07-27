public class Test {
    public static void main(String[] args) {
        DAY dayTOU = DAY.TOU;
        System.out.println(dayTOU.ordinal());
    }
}
enum DAY{
    MON,TOU,WED,THU,FRI,SAT,SUN;

    public void week(DAY day){
        switch (day){
            case MON:
            case TOU:
            case WED:
            case THU:
            case FRI:
                System.out.println("阿巴");
                break;
            case SAT:
                System.out.println("阿巴星期六");
                break;
            case SUN:
                System.out.println("阿巴星期天");
                break;
            default:
                System.out.println("没了，你看你妈呢");
        }
    }
}