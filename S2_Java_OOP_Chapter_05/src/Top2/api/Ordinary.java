package Top2.api;

public interface Ordinary { // 普通冰箱
    void frozen(int temp1, int temp2);
    void refrigeration(int temp1, int temp2);
    void manualSetRefrigeration(int temp);
    void manualSetFrozen(int temp);

}