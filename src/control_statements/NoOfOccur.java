package control_statements;

public class NoOfOccur {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int num=267663386;
        while(num>0){
            int dig=num%10;
            arr[dig]++;
            num=num/10;
        }
        System.out.println("Number and its occurrence");
        for(int i=0;i<arr.length;i++){
            System.out.println(i+": "+arr[i]);
        }


    }
}
