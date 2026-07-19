package control_statements;

public class DupliEle {
    public static void main(String[] args) {
        int arr[]={23,18,18,34,23,71,71};
        for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]==arr[j]){
					System.out.println("Repeated at index "+j +" and element is : "+arr[i]+ " ");
				}
			}
		}
    }
}
