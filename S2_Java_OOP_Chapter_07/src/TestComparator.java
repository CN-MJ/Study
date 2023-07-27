import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
//        list.sort(new Numberbercomparator());
//        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
class Numberbercomparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1-o2;
        return o2-o1;
//        return 0;
    }
}
