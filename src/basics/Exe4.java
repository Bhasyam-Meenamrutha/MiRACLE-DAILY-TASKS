package basics;

public class Exe4 {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float avg(int a,int b,int c){
        return (float)(a+b+c)/3;
    }

    public static void main(String[] args) {
        int a=10,b=12,c=15;
        System.out.println(sum(a,b,c));
        System.out.println(avg(a,b,c));


    }
}
