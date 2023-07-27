package Top2;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Top2.Dog dog1 = new Top2.Dog("爱的色放", "去微软");
        Top2.Dog dog2 = new Top2.Dog("广东富豪", "七二万人");
        Top2.Dog dog3 = new Top2.Dog("为人体", "的风格和");
        Top2.Dog dog5 = new Top2.Dog("肉体与", "阿斯蒂芬");
        Top2.Dog dog4 = new Top2.Dog("从v下班", "肉体与");
        LinkedList<Dog> list = new LinkedList<Dog>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        list.add(dog5);
        Dog dogFirst = list.removeFirst();
        Dog dogLast = list.removeLast();
        System.out.println("第一条狗"+dogFirst.getName());
        System.out.println("最后一条狗"+dogLast.getName());
        System.out.println("还有"+list.size()+"条狗");
        System.out.println("分别是");
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()){
            Top2.Dog dog = iterator.next();
            System.out.println(dog.getName()+"\t"+dog.getVariety());
        }
    }
}