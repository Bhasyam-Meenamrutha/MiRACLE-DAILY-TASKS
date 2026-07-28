package control_statements;
// 1
// *2*
// **3**
// ***4***
// ****5****
// *****6*****
// ******7******
public class Pattern15 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i*2-1;j++){
                if(i==j){
                    System.out.print(j);
                } else System.out.print("*");
            }System.out.println();
        }
    }
}
