package control_statements;
//     1
//    212
//   32123
//  4321234
public class Pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int x=i;x>=2;x--){
                System.out.print(x);
            }
        

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
