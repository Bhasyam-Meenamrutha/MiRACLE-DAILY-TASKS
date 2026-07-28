package strings;
//12.Program to count the number of vowels and consonants in a given string.
public class CountVowelConso {
    public static void main(String[] args) {
        String nam="Meenamrutha Bhasyam";
        int vowel=0;
        int conso=0;
        String name=nam.toLowerCase();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'||ch=='u') vowel++;
            else if(Character.isAlphabetic(name.charAt(i))) conso++;
        }
        System.out.println("Vowles:"+vowel);
        System.out.println("Conso:"+conso);
    }
}
