package Top1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player gems = new Player();
        Player enemy = new Player();

        System.out.println("开始");
        System.out.println("你的名字");
        gems.setName(scanner.next());

        System.out.println("1.阿斯顿， 2.去微软， 3.自行测");
        String role = scanner.next();
        do {
            switch (role){
                case "1":
                    enemy.setName("阿斯顿");
                    break;
                case "2":
                    enemy.setName("去微软");
                    break;
                case "3":
                    enemy.setName("自行测");
                    break;
                default:
                    System.out.println("请选择正确的");
            }
        }while (enemy.getName().isEmpty());
        System.out.println("开打");
        String check;
        int round=0;
        do {
            System.out.println("回合"+ ++round);

            gems.shootEnemy(gems.getName(), enemy.getName());
            gems.getGun().getClip().ShowClip();

            enemy.shootEnemy(enemy.getName(), enemy.getName());
            enemy.getGun().getClip().ShowClip();

            gems.showPlayer();
            enemy.showPlayer();

            if (gems.getHp() <= 0 || enemy.getHp() <= 0) {
                if (gems.getHp() > enemy.getHp()) {
                    System.out.println("你赢了");
                } else {
                    System.out.println("ai赢了");
                }
                System.out.println("游戏结束");
                check = "n";
            }else {
                System.out.println("是否继续(y/n)");
                check = scanner.next();
            }


        }while (check.equals("y"));
    }
}
