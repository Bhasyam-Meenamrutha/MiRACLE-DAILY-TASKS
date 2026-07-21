package strings;
//Write a program to find the percentage of uppercase, lowercase, vowels,
//consonants digits, and special characters in a String
public class Percentage {
    public static void main(String[] args) {
        String msg="Hello, welcome to ITG-171!";
        int tolNum=0;
        int tolSplChar=0;
        int tolVow=0;
        int tolCon=0;
        int tolUpp=0;
        int tolLow=0;
        int totLength=msg.length();
        for(int i=0;i<msg.length();i++){
            char ch=msg.charAt(i);

            if(ch>='a' &&  ch<='z') tolLow++;
            if(ch>='A' && ch<='Z') tolUpp++;
        }

        String lower=msg.toLowerCase();

        for(int i=0;i<msg.length();i++){
            char ch=lower.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')tolVow++;
            else if(ch>='a' && ch<='z' ) tolCon++;
            else if(ch>='0' && ch<='9') tolNum++; 
            else tolSplChar++;
        }

        System.out.println("Total Percentage Vowels: " + (tolVow * 100.0) / totLength);
        System.out.println("Total Percentage Consonants: " + (tolCon * 100.0) / totLength);
        System.out.println("Total Percentage Digits: " + (tolNum * 100.0) / totLength);
        System.out.println("Total Percentage Special Characters: " + (tolSplChar * 100.0) / totLength);
        System.out.println("Total Percentage Uppercase: " + (tolUpp * 100.0) / totLength);
        System.out.println("Total Percentage Lowercase: " + (tolLow * 100.0) / totLength);
                


        

    }
}
