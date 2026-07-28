package oops;


//Program to Show Overriding of Methods in Classes
public class Overriding extends Overloading  {

    @Override
    void getNameAge(String name, int age) {
        //super.getNameAge(name, age);
        System.out.println("Method getNameAge is over rideded");
    }

    public static void main(String[] args) {

        Overriding ov= new Overriding();
        ov.getNameAge("pavani",21);
        
        
    }
    
}
