package control_statements;

public class NPrimeNo {
    public static void main(String[] args) {
        int n=15;
        while(n>0){
            int count=0;
            for(int i=2;i<=Integer.MAX_VALUE;i++){
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        count++;
                    }
                    if(count>15)
                        break;
                }
                if(count==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}