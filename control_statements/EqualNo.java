package control_statements;

public class EqualNo {
    public static void main(String[] args) {
        
        int num=888888;
        int dig=num%10;
        int count=0;
        while (num>0){
            
            int dig1=num%10;
            num=num/10;
            if(dig1!=dig){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("all digits in a given number are equal");

        }
        else System.out.println("all digits in a given number are not equal");

        
    }
}
