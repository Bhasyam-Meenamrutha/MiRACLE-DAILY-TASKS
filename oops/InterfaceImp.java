package oops;

public class InterfaceImp implements InterfaceProg {
    public double age(int year,double month){
        return (year+month);
    }
    public String name(String fname){
        return "First name is "+fname;
    }
    public static void main(String[] args) {
        InterfaceImp imp= new InterfaceImp();
        System.out.println(imp.age(21,0.6));
        System.out.println(imp.name("Meena"));
    }
}
