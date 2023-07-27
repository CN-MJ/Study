public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>(2);
        list.add("114");
        list.add("514");
        list.add("1919");
        list.add("810");
        System.out.println(list);
        System.out.println(list.indexOf("514"));
        for (String er:list) {
            System.out.println(er);
            System.out.println(list.indexOf(er));
        }
        list.set(2,"哼~哼~哼~哼！");
        System.out.println(list);
        list.remove(3);
        list.remove("514");
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add("114");
        System.out.println(list.lastIndexOf("114"));
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list.size()+"+"+list.isEmpty());
    }
}