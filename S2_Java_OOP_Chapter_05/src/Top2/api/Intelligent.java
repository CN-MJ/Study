package Top2.api;

public interface Intelligent { // 智能冰箱
    void MoveIngredients();
    void Defrost();
    void ShowIngredients();
    void ReplenishIngredients();
    void AutoSetFrozen(int Temp);
    void AutoSetRefrigeration(int Temp);
}
