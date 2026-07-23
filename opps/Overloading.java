package opps;
//Program to Show Overloading of Methods in Class
public class Overloading {
    
    void add(int a, int b){
        System.out.println("Addition of two integers: " + (a + b));
    }

    void add(double a, double b){
        System.out.println("Addition of two doubles: " + (a + b));
    }

    void add(int a, int b, int c){
        System.out.println("Addition of three integers: " + (a + b + c));
    }

    void getNameAge(int age, String name){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void getNameAge(String name, int age){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add(5, 10);
        obj.add(5.5, 10.5);
        obj.add(1, 2, 3);
        obj.getNameAge(22,"Meena");
        obj.getNameAge("Amrutha", 022);
    }
    
}
