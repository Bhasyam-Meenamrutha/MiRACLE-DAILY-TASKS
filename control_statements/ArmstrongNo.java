package control_statements;
//Armstrong number btw 1 to 1000
public class ArmstrongNo {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                int dig=temp%10;
                sum=sum+dig*dig*dig;
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
