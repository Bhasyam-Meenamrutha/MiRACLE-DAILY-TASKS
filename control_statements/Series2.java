package control_statements;
// 1/1+1/2^2+1/3^2+1/4^2+1/5^2 
public class Series2 {
    public static void main(String[] args) {
        int n=5;
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/(i*i);
        }
        System.out.println(sum);
    }
}
