public class Top3 {
    public static void main(String[] args) {
        Animal_T1 animal = new Dog_T1();
        animal.sry();
        animal = new Cat_T1();
        animal.sry();
    }
}
class Animal_T1{
    public void sry(){

    }
}

class Dog_T1 extends Animal_T1{
    @Override
    public void sry() {
        System.out.println("汪");
    }
}
class Cat_T1 extends Animal_T1{
    @Override
    public void sry() {
        System.out.println("喵");
    }
}