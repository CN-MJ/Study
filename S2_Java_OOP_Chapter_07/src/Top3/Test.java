package Top3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map =new HashMap<>();
        map.put("CN", "中国");
        map.put("RUS","俄罗斯");
        map.put("US","美国");
        map.put("GBR","英国");
        System.out.println("CN对应的是"+map.get("CN"));
        System.out.println("有"+map.size()+"组数据");
        System.out.println("包含RUS的key吗"+map.containsKey("RUS"));
        System.out.println("包含RUS的key吗"+map.containsKey("RUS"));
        Set<String> keySet = map.keySet();
        Collection listValues = map.values();
        System.out.println(keySet);
        System.out.println(listValues);
        System.out.println(map);
        map.clear();
        System.out.println("已清除map");
    }
}
