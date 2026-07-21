package strings;
//Program to implement user-defined function to compare two strings.
public class CompairTwoStrings {
    public static void main(String[] args) {
        String s1="Meenam";
        String s2="Meena";
        boolean same=true;

        if(s1.length()!=s2.length()){
            System.out.println("Not Equal");
            return;

        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                same=false;
                break;
            }

            
        }
        if(same)System.out.println("Equal");
        else System.out.println("Not equal");
    }
}
