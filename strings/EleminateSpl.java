package strings;
//10.Program to eliminate special characters and numbers other than [a, A---z, Z].
public class EleminateSpl {
    public static void main(String[] args) {
        String msg= "Hi, Wellcomeee 171!";
        String lower=msg.toLowerCase();
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i);
            if(Character.isAlphabetic(msg.charAt(i))){
                System.out.print(ch);
            }
        }
                System.out.println();

    }
}
