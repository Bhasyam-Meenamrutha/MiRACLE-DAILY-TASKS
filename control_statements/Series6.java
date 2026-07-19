package control_statements;
//  1/1+1/4+1/9+…1/N^2 
public class Series6 {
    public static void main(String[] args) {
        int n=5;
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/(i*i);
        }
        System.out.println(sum);
    }
}
