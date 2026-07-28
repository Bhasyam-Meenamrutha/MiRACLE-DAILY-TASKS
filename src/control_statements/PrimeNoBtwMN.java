package control_statements;

public class PrimeNoBtwMN {
    public static void main(String[] args) {
        int m = 10;
        int n = 50;
        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

}
