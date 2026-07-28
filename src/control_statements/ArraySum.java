package control_statements;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]={10,80,40,20,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
