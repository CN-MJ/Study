import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1, "地方");
        list.add(1, "地方");
        list.add(1, "地方");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
}
