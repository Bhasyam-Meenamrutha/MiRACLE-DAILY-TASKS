package control_statements;

public class HCF {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        System.out.println(gcd(a,b));
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println(a);
    }

    //using recussion
    static int gcd(int a,int b){
        if(b==0) return a;
        if(a==b) return a;
        return gcd(b,a%b);
    }    
}
