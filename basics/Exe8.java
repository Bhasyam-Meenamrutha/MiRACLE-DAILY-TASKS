package basics;

public class Exe8 {
    public static void displayint(){
       System.out.println("No parameter");
    }
    public static void displayint(int para1,int para2){
       System.out.println("2 parameter");

    }
     public static void displayint(int para1,int para2,int para3){
       System.out.println("3 parameter");

    }
    public static void main(String[] args) {
        displayint();
        displayint(2,8);
        displayint(9,7,0);
    }
}
