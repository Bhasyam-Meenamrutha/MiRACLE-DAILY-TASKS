package control_statements;
// 1/1+1/2+1/3+…1/N 
public class Series1 {
    public static void main(String[] args) {
        int n=5;
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println(sum);
    }

}
