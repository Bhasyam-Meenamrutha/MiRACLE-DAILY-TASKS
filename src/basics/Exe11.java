package basics;

public class Exe11 {

    public Exe11() {
        this(10, 6);
        System.out.println("Default");
    }
    public Exe11(int a,int b){
        this("Meena");
        System.out.println("Int con");
    }
    public Exe11(String x){
        System.out.println("String con");
    }

    public static void main(String[] args) {
        Exe11 ex=new Exe11();
    }
    
}
