package control_statements;

import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0){
            System.out.println("Postive Number");
        }
        else if(x==0){
            System.out.println("Nighter positiove nor Negitive");
        }
        else{
            System.out.println("Negitive Number");
        }
    }
    
}
