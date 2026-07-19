package control_statements;

public class NperfectNo {
    public static void main(String[] args) {
        int n=3;
        int num=1;
        int count=0;
        
        while(count<n){
            if(perfect(num)){
                
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean perfect(int num){
        int sum=1;
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            sum=sum+i;

        }
        return sum==num;
    }
}
