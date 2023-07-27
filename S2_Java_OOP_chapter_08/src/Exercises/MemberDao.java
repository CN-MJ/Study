package Exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MemberDao {

    // 存储数据的arraylist
    ArrayList<Member> members = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    LocalDate localDate = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String Date = localDate.format(dtf);




    public void menu() {
        // 测试数据
        members.add(new Member("张三", 10000001, 123456, 100, Date));
        members.add(new Member("李四", 10000002, 123456, 100, Date));
        members.add(new Member("王五", 10000003, 123456, 100, Date));

        // 菜单显示方法
        while (true) {
            System.out.println("欢迎");
            System.out.println("1.注册\t" +
                    "2.积分累计\t" +
                    "3.积分兑换\t" +
                    "4.积分查询\t" +
                    "5.修改密码\t" +
                    "6.退出"
            );
            System.out.print("请选择：");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    register();
                    break;
                case 2:
                    saveScore();
                    break;
                case 3:
                    minusScore();
                    break;
                case 4:
                    showScore();
                    break;
                case 5:
                    changePwd();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new RuntimeException("输入错误");

            }

        }
    }

    // 注册方法
    public void register() {

        System.out.print("请输入注册名称：");
        String name = scanner.next();

        System.out.print("请输入注册密码（大于6为小于八位的数字）：");
        int password = scanner.nextInt();


        String Date = localDate.format(dtf);

        if (name != null || (password >= 6 && password <= 8)) {
            Member member = new Member(name, createId(), password, 100, Date);
            members.add(member);
            System.out.println("注册成功");
        }

    }

    //积分累计
    public void saveScore() {
        System.out.print("请输入编号");
        int cardId = scanner.nextInt();

        System.out.print("请输入密码");
        int password = scanner.nextInt();

        System.out.print("请输入你这次消费的金额：");
        int money = scanner.nextInt();


        Member member = hasMember(cardId, password);
        if (member != null) {
            member.setScore(member.getScore() + money);
            System.out.println("积分累计成功");
        } else {
            System.out.println("账户或密码错误");
        }


    }

    // 积分兑换
    public void minusScore() {
        System.out.print("请输入编号：");
        int cardId = scanner.nextInt();

        System.out.print("请输入密码：");
        int password = scanner.nextInt();

        Member member = hasMember(cardId, password);
        if (member != null) {
            System.out.print("积分剩余：" + member.getScore());

            System.out.print("请输入需兑换的积分（100兑换一元，不足一百不能使用）：");
            int exchange = scanner.nextInt();

            if (member.getScore() - exchange > 100) {
                System.out.println("此次兑换" + exchange / 100);
                member.setScore(member.getScore()-exchange);
            } else {
                System.out.println("积分不足不能兑换");
            }

        } else {
            System.out.println("账户或密码错误");
        }


    }

    // 积分查询
    public void showScore() {
        System.out.print("请输入编号：");
        int cardId = scanner.nextInt();

        System.out.print("请输入密码：");
        int password = scanner.nextInt();

        Member member = hasMember(cardId, password);
        if (member != null) {
            System.out.println("姓名" +
                    "\t会员编号" +
                    "\t剩余积分" +
                    "\t注册日期"
            );
            System.out.println(member.getName()
                    + "\t" + member.getCardId()
                    + "\t" + member.getScore()
                    + "\t" + member.getRegisterDate()
            );
        } else {
            System.out.println("账户或密码错误");
        }

    }

    // 修改密码
    public void changePwd() {
        System.out.print("请输入编号：");
        int cardId = scanner.nextInt();

        System.out.print("请输入密码：");
        int password = scanner.nextInt();

        Member member = hasMember(cardId, password);
        if (member != null) {
            System.out.print("请输入修改后的密码：");
            int newPassword = scanner.nextInt();
            if (newPassword == member.getPassword()) {
                System.out.println("前后密码不能重复");
            } else {
                member.setPassword(newPassword);
            }
        } else {
            System.out.println("账户或密码错误");
        }
    }

    // 判断输入的会员是否存在
    public Member hasMember(int cardId, int password) {

        for (Member obj : members) {
            if (obj.getCardId() == cardId && obj.getPassword() == password) {
                return obj;
            }
        }
        return null;
    }

    // 生成随机编号
    public Integer createId() {

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            str.append(random.nextInt(9));
        }
        return Integer.parseInt(String.valueOf(str));
    }
}
