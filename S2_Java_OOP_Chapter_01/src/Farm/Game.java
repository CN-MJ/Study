package Farm;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Corn corn = new Corn(); // 创建玉米对象
        AppleTree appleTree = new AppleTree(); // 创建苹果树对象
        int type; // 选择的作物类型
        int options; // 用户选择的操作
        boolean isExit = false; // 控制循环退出的标志

        System.out.println("欢迎来到星沐生态农场");

        do {
            System.out.print("请选择：1.种植作物 2.查看生长状态 3.收获果实 4.退出");
            options = scanner.nextInt(); // 获取用户输入的选项
            switch (options) {
                case 1:
                    System.out.print("请输入您想要种植的作物：1.苹果树 2.玉米");
                    type = scanner.nextInt(); // 获取用户选择的作物类型
                    switch (type) {
                        case 1:
                            int appleType;
                            System.out.println("请选择苹果树类型：1.富士 2.金帅");
                            appleType = scanner.nextInt(); // 获取用户选择的苹果树类型
                            appleTree.setBrand((appleType == 1) ? "富士" : "金帅"); // 根据用户选择设置苹果树品牌
                            appleTree.print(); // 显示苹果树种植信息
                            break;
                        case 2:
                            int cornPrice;
                            System.out.println("请选择收割机类型：1.家用收割机（50元） 2.联合收割机（100元）");
                            cornPrice = scanner.nextInt(); // 获取用户选择的收割机类型
                            corn.harvestCost = (cornPrice == 1) ? 50 : 100; // 根据用户选择设置玉米收割机价格
                            corn.print(); // 显示玉米种植信息
                            break;
                        default:
                            System.out.println("你输入的选项有误");
                            break;
                    }
                    isExit = true; // 设置退出循环标志为true
                    break;
                case 2:
                case 3:
                    System.out.println("功能暂无");
                    isExit = true; // 设置退出循环标志为true
                    break;
                case 4:
                    System.out.println("退出");
                    isExit = false; // 设置退出循环标志为false
                    break;
                default:
                    System.out.println("你输入的选项有误");
            }
        } while (isExit);
    }
}