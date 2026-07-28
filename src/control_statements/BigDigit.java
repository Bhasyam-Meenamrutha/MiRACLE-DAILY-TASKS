package control_statements;

public class BigDigit {
    public static void main(String[] args) {
        int num=674933;
        int max=num%10;
        while(num>0){
            int dig=num%10;
            if(dig>max){
                max=dig;
            }
            num=num/10;
        }
        System.out.println(max);
    }
}
