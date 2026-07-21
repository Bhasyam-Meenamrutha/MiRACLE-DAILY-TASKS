package strings;
//Program to find length of the string without using predefined function for finding length.
public class FindLength {
   public static void main(String[] args) {
    String name="Bhasyam Meenamrutha";
    int count=0;
        for(char c:name.toCharArray()){
            count ++;
        }
        System.out.println(count);


   } 
}
