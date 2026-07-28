package control_statements;

public class PrintEvenNo {
    public static void main(String[] args) {
        int n=16;
        //using for
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        //using while
        int i=0;
        while(i<n){
            if(i%2==0){
                System.out.println(i);
            
            }i++;
        }
        //using do-while
        do { 
            if(i%2==0){
                System.out.println(i);
            
            }i++;
        } while (i<n);
    }   
}
