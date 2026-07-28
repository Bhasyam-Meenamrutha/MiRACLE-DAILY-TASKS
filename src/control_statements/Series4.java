package control_statements;
// 1/2^0+1/2^1+1/2^2+1/2^3+1/2^4 
public class Series4 {
    public static void main(String[] args) {
        int n=5;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=1.0/Math.pow(2,i);
        }
        System.out.println(sum);
    }
}
