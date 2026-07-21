package strings;
//Program to separate the Individual Characters from a String 
public class SeperateToChar {
    public static void main(String[] args) {
        String s="Meenamrutha";
        char[] c=s.format("%s", s).toCharArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
