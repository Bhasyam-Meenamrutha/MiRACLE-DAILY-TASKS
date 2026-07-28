package control_statements;

public class PerfectMN {
    public static void main(String[] args) {
        int m = 5;
        int n = 500;
        
        for (int i = m; i <= n; i++) {
            int sum=1;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum=sum+j;
                    
                }
            }
            if (sum==i) {
                System.out.println(i);
            }
        }
    }
}
