package basics;

public class Exe7 {

    public static int displayint(){
        int num1=9;
        int num2=8;
        return num1+num2;
    }
    public static String displayString(){
        String first_name="Meenamrutha";
        String Last_name="Bhasyam";
        return first_name+Last_name;
    }
     public static float displayFloat(){
        int num1=9;
        int num2=8;
        return (float)num1+num2;
    }
    public static void main(String[] args) {
        System.out.println(displayint());
        System.out.println( displayString());
        System.out.println( displayFloat());


        
    }
}
