package strings;

public class WordByWord {
    public static void main(String[] args) {
        String str="java is a object oriented programing language";
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
