package basics;

public class Exe12 {
    static int age;
    static String name;
    static double Sal;

    public Exe12(int age,String name,double sal) {
        this.age=age;
        this.name=name;
        this.Sal=Sal;

    }
    public static void main(String[] args) {
        Exe12 ex=new Exe12(22,"meena",28000.09);
        System.out.println("age:"+age+" , name:"+ name+" ,sal"+Sal);
    }

    
}
