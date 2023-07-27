import java.util.HashMap;
import java.util.Iterator;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 11);
        map.put("李四", 33);
        map.put("王五", 22);
        map.put("赵六", 55);

        HashMap<String, Integer> mapClone = new HashMap<>(map);

        System.out.println(mapClone);



        System.out.println(map.keySet()); // 输出键
        System.out.println(map.values()); // 输出值


        // 输出map
        System.out.println(map);

        // 使用增强for循环遍历键
        for (Object m: map.keySet()) {
            System.out.println(m);
        }

        // 使用增强for循环遍历值
        for (Object m: map.values()) {
            System.out.println(m);
        }

        Iterator iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator iterator2 = map.values().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
