package control_statements;

public class AddOddEvenDig {
    public static void main(String[] args) {
        int num=67893441;
        int evensum=0;
        int oddsum=0;
        while(num>0){
            int dig=num%10;
            num=num/10;
            if(dig%2==0){
                evensum=evensum+dig;
            }
            else oddsum=oddsum+dig;
        }
        System.out.println("Sum of even digits: "+evensum);
        System.out.println("Sum of odd digits: "+oddsum);
    }
}
