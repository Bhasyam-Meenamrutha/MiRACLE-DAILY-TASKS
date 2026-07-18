package control_statements;

public class ReverseNo {
    public static void main(String[] args) {
        int rev=0;
        int num=123456;
        while(num>0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        System.out.println(rev);
    }
}
