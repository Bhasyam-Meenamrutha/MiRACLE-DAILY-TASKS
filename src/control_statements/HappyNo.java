package control_statements;
import java.util.HashSet;
import java.util.Set;
public class HappyNo {
    public static void main(String[] args) {
        int n=16;
        Set<Integer> set = new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum=sum+(n%10)*(n%10);
                n=n/10;
            }
            if(sum==1) {
                System.out.println("Happy Number");
                break;
            }else{
                n=sum;
                if(set.contains(n)){
                    System.out.println("Not a Happy Number");
                    break;
                }
                set.add(n);
            }
        }
    }
}
