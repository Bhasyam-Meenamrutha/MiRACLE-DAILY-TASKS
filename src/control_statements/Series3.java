package control_statements;
// 1/1^0+1/2^1+1/3^2+1/4^3+1/5^4
public class Series3 {
    public static void main(String[] args) {
        int n=5;
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/Math.pow(i,i-1);
        }
        System.out.println(sum);
    }
}
