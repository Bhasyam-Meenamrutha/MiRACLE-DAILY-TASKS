package control_statements;

public class AddFirstLast {
    public static void main(String[] args) {
        int num=445908;
        int ldig=num%10;
        int fdig=0;
        while(num>0){
            fdig=num%10;
            num=num/10;
        }
        System.out.println(fdig+ldig);
    }
}
