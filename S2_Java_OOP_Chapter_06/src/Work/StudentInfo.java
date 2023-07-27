package Work;

import java.util.Scanner;

import Work.Utils.NumUtils;


public class StudentInfo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            try {
                System.out.println("开始录入同学"+(i+1));

                students[i] = new Student();

                System.out.println("同学" + (i+1) + "的名字");
                students[i].setName(scanner.next());

                System.out.println("同学" + (i+1) + "的手机号");
                students[i].setPhoneNumber(scanner.next());

                System.out.println("同学" + (i+1) + "的性别");
                String sex = scanner.next();
                try {
                    if (!"男".equals(sex) && !"女".equals(sex)) {
                        throw new SexException("性别必须填写正确");
                    }
                }catch (SexException e){
                    e.printStackTrace();
                }
                students[i].setSex(sex);

                System.out.println("同学" + (i+1) + "的学号自动写入");
                students[i].setStudentId(NumUtils.randomNum());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("录入完成，开始输出");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"号学生姓名"+students[i].getName());
            System.out.println((i+1)+"号学生性别"+students[i].getSex());
            System.out.println((i+1)+"号学生手机号"+students[i].getPhoneNumber());
            System.out.println((i+1)+"号学生学号"+students[i].getStudentId());
        }
    }
}