package basics;

public class Exe10 {
    static int age;
    static String name;
    public Exe10(int age,String name) {
        this.age=age;
        this.name=name;
    }

    static void dis() {
        System.out.println("age:"+age+" ,name:"+name);
    }

    
    public static void main(String[] args) {
        Exe10 ex=new Exe10(22,"Meena");
        ex.dis();
    }
}
