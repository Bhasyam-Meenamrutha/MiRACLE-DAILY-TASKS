package basics;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]= {44,89,9,44,39,6,9,39,44};
		for(int i=0;i<arr.length;i++) {
			boolean isprinted=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					//System.out.println(arr[j]);
					isprinted=true;
					break;
					
				}
				
			}
			if(isprinted) continue;
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
				System.out.println(arr[k]);
				break;
				}
			}
		}
		
	}

}
