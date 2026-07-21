package strings;
//Program to replace each word’s first letter with its previous character in a given sentence
public class ReplaceWithPrev {
    public static void main(String[] args) {
        String str="Iello Fveryone";
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++){

            char ch=arr[i].charAt(0);
            ch=(char)(ch-1);

            arr[i]= ch+arr[i].substring(1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
    }
}
