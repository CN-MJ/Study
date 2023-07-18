package Top2;

import Top2.FridgeType.RegularFridge;
import Top2.FridgeType.SmartFridge;

public class Main {
    public static void main(String[] args) {

        SmartFridge smartFridge = new SmartFridge();
        RegularFridge regularFridge = new RegularFridge();
        System.out.println("普通冰箱");
        regularFridge.ShowInfo();
        regularFridge.refrigeration(-1, 8);
        regularFridge.frozen(-25,15);
        regularFridge.manualSetRefrigeration(0);
        regularFridge.manualSetFrozen(-25);
        System.out.println();
        smartFridge.ShowInfo();
        smartFridge.MoveIngredients();
        smartFridge.Defrost();
        smartFridge.AutoSetRefrigeration(1);
        smartFridge.AutoSetFrozen(22);
        smartFridge.ReplenishIngredients();
        smartFridge.ShowIngredients();
    }
}
