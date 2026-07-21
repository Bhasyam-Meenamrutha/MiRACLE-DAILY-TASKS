package strings;
//Program to delete given character from given string.
public class DeleteChar {
    public static void main(String[] args) {
        
        char ch='a';
        String s="Meenamrutha";
        String slower=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=slower.charAt(i);
            if(ch!=c) 
            System.out.print(c);
        }

    }
}
