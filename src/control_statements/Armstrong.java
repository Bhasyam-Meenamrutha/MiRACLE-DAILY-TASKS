package control_statements;

public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int sum=0;
        int temp=num;
        while(num>0){
            int dig=num%10;
            sum=sum+dig*dig*dig;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}