package strings;

import java.util.Arrays;

public class AlphabeticalOrder {
    public static void main(String[] args) {

        String str= "Teddy&Roy";
        str=str.toLowerCase();

        char[] c=str.toCharArray();

        Arrays.sort(c);

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
         for(int i=c.length-1;i<=0;i--){
            System.out.print(c[i]+" ");
        }

        
}
}
