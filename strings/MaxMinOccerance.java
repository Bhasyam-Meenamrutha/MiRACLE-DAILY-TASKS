package strings;
//Program to find maximum and minimum occurring character in a string
public class MaxMinOccerance{
    public static void main(String[] args) {
        String name="PanduRanga";
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int arr[]=new int[256];
        for(int i=0;i<name.length();i++){
            arr[name.charAt(i)]++;
        }
        char maxChar=' ';
        char minChar=' ';
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(arr[ch]>max){
                max=arr[ch];
                maxChar=ch;
            }

            if(arr[ch]<min && arr[ch]>0){
                min=arr[ch];
                minChar=ch;
            }
        }
        System.out.println("Max occured Char:"+maxChar+" Times:"+max);
        System.out.println("Min occured Char:"+minChar+" Times:"+min);


    }

}