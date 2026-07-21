package strings;
//Program to find Reverse and the length  of the string without predefined functions. 
public class ReverseLength {
    public static void main(String[] args) {
        String name="Meenamrutha";
        String revname="";
        for(int i=name.length()-1;i>=0;i--){
            revname=revname+name.charAt(i);
        }
        System.out.println(revname);

        //with out predifine length fun
        int count=0;
        for(char c:name.toCharArray()){
            count ++;
        }
        System.out.println(count);

        
    }
}
