package control_statements;
//  1 2 3 4 
//   2 3 4 
//    3 4 
//     4 
//    3 4 
//   2 3 4 
//  1 2 3 4 
public class Pattern11 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int k=i;k>=1;k--)
            System.out.print(" ");
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
        for(int i=n-1;i>=1;i--){
            for(int k=i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
