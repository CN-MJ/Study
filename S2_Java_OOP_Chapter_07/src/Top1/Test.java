package Top1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("爱的色放", "去微软");
        Dog dog2 = new Dog("广东富豪", "七二万人");
        Dog dog3 = new Dog("为人体", "的风格和");
        Dog dog5 = new Dog("肉体与", "阿斯蒂芬");
        Dog dog4 = new Dog("从v下班", "肉体与");
        ArrayList<Object> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        list.add(dog5);


        list.remove(2);
        System.out.println(list.size());


        for (Object value : list) {
            Dog dog = (Dog) value;
            System.out.print(dog.getName() + "\t");
            System.out.print(dog.getVariety());
        }
        System.out.println();
        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.print(dog.getName() + "\t");
            System.out.print(dog.getVariety());

        }
    }
}
