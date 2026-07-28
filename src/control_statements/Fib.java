package control_statements;

public class Fib {
    public static void main(String[] args) {
        int n=8;
        // System.out.println("0 ");
        // System.out.println("1 ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+ " ");
            
        }
    }
    public static int fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
