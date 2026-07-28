package control_statements;

public class NPrimeNo {
    public static void main(String[] args) {
        int n=15;
        int num=2;
        int count=0;
        while(count<n){
            if(prime(num)){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }   
    }
    public static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}