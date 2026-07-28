package strings;
//Program to convert the first letter of each word into uppercase in a given string.
public class ConvertToUpper {
    public static void main(String[] args) {
        String msg= "Hello, wellcome to ITG-171";
        String s[]=msg.split(" ");
        for(int i=0;i<s.length;i++){
            s[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1);

        }

        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
