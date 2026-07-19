package control_statements;
// Find Smallest of Three Numbers Using Ternary Operator
public class SmallestTernary {
    public static void main(String[] args) {
        int a=90, b=70, c=72;
        int sml=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println(sml);
    } 
    
}
  