public class Top2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.call();
        Animal cat  = new Cat();
        cat.call();
    }
}
class Animal{
    public void call(){    }
}
class Dog extends Animal{
    @Override
    public void call(){
        System.out.println("汪");
    }
}
class Cat extends Animal{
    @Override
    public void call(){
        System.out.println("苗");
    }
}