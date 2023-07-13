package Top2.GameInterfacePackage;

public interface ISplit {
    /*
     * 分裂能力
     * */
    public default void split(){
        System.out.println("使用分裂攻击");
    };
}
