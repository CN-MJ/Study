public class Generic {
    public static void main(String[] args) {
        Person<Object> person = new Person();
        person.str = new Object();
    }
    static void say(Person<Object> person){
        System.out.println(person);
    }
}
class Person<Per>{
    public Per str;
}
class Student<Stu>{

}
