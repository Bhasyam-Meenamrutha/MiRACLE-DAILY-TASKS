package exception_handling_one;

public class FinallyEx {

	public static void main(String[] args) {
		int arr[]= {5,3,2,1,6,53};
		
		try {
			for(int i=0;i<arr.length+1;i++)
				System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Array index is out of bounds.");
		}finally {
			System.out.println("Program completed");
		}

	}

}
