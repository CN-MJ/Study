import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> list  =new ArrayList<>();
        list.add("阿斯蒂芬");
        list.add("去微软");
        list.add("离开家");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            Object str = iterator.next();
            System.out.println(str);
        }


        ArrayList<Integer> intList = new ArrayList();
        intList.add(1);
        intList.add(32);
        intList.add(2);
        intList.add(4);
        Iterator iterator_intList = intList.listIterator();
        while (iterator_intList.hasNext()){
            Object in = iterator_intList.next();
            System.out.println(in);
        }
    }
}
