package control_statements;

public class OddEvenArray {
    public static void main(String[] args) {
        int arr[]={10,89,67,34,22,19,67,84,90,11};
        System.out.print("Even Numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
