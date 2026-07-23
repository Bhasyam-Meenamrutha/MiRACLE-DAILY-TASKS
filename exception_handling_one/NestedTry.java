package exception_handling_one;

public class NestedTry {

	public static void main(String[] args) {
		int arr[]= {5,3,2,1,6,53};
		try {
		
			try {
				int x=12*3/0;
			}catch(ArithmeticException e) {
				System.out.println("Can't divide with zero. ");
			}
			
			for(int i=0;i<arr.length+1;i++) System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException o) {
			System.out.println("Array index is out of bounds.");

		}
	}

}
