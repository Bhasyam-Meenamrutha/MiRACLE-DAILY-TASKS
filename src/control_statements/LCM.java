package control_statements;

public class LCM {
    public static void main(String[] args) {
        int a=18;
        int b=12;
        int lcm=(a>b)?a:b;
        while(1==1){
            if(lcm%a==0 && lcm%b==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
