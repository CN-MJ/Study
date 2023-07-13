public class Top4 {
    public static void main(String[] args) {
        Person s = new Doctor();
        Person d = new Doctor();
        ((Student)s).study();
        d.show();
    }
}
class Person{
    public void show(){
        System.out.println("人类！");
    }
}
class Student extends Person{
    public void study(){
        System.out.println("学生");
    }
}
class Doctor extends Person{
    public void show(){
        System.out.println("医生");
    }
}

