package Top2;

import Top2.BirdClassPackage.BombBird;
import Top2.BirdClassPackage.FlameSplitBird;
import Top2.BirdClassPackage.SpinBird;
import Top2.BirdClassPackage.SuperBird;

import java.util.Scanner;

public class GameTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check;
        do {
            check = menu();
        } while (check);
    }

    public static boolean menu() {
        System.out.println("请选择鸟类型："
                + "1.炸弹鸟"
                + "2.喷火分裂鸟"
                + "3.旋转鸟"
                + "4.超级鸟"
                + "5.退出"
        );
        int userInput = scanner.nextInt();
        boolean check = false;
        Bird bird = null;
        switch (userInput) {
            case 1:
                bird = new BombBird();
                check = true;
                bird.show();
                break;
            case 2:
                bird = new FlameSplitBird();
                check = true;
                bird.show();
                break;
            case 3:
                bird = new SpinBird();
                check = true;
                bird.show();
                break;
            case 4:
                bird = new SuperBird();
                check = true;
                bird.show();
                break;
            case 5:
                break;
            default: {
                System.out.println("请输入正确的选项");
            }
        }
        return check;
    }
}
