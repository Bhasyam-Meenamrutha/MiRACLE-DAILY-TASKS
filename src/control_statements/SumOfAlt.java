package control_statements;

public class SumOfAlt {
    public static void main(String[] args) {
        int n=123456;
        System.out.println(sumOfAlt(n));
    }
    public static int sumOfAlt(int n){
        if (n==0) return 0;
        return n%10+sumOfAlt(n/100);
    }
}