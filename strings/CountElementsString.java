package strings;
//Program to count the total number of Words,Numbers,Spl characters,vowels
//and consonants in a string
public class CountElementsString {
    public static void main(String[] args) {
        String msg="Hello, welcome to ITG-171";
        int tolWords=0;
        int tolNum=0;
        int tolSplChar=0;
        int tolVow=0;
        int tolCon=0;
        String lower=msg.toLowerCase();

        for(int i=0;i<msg.length();i++){
            char ch=lower.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')tolVow++;
            else if(ch>='a' && ch<='z' ) tolCon++;
            else if(ch>='0' && ch<='9') tolNum++; 
            else tolSplChar++;
        }
        System.out.println("Totle vowels:"+tolVow);
        System.out.println("Totle Consonents:"+tolCon);
        System.out.println("Totle digits:"+tolNum);
        System.out.println("Totle SPL char:"+tolSplChar);

        String[] s1=msg.split(" ");
        System.out.println("Totle words: "+s1.length);







    }
}
