package control_statements;

public class ArrayToArray {
    public static void main(String[] args) {
        int arr1[]={9,2,5,4,3,6,7,8,1};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
