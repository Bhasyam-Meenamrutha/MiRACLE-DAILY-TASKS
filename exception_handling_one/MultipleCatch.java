package exception_handling_one;

public class MultipleCatch {

	public static void main(String[] args) {
		int arr[]= {5,3,2,1,6,53};
		try {
			System.out.println("Array elements are: ");
			for(int i=0;i<arr.length+1;i++)
			System.out.println(arr[i]);
			int a = 10 / 0;   
				
		}catch(ArithmeticException  e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException x) {
			System.out.println(x);

		}catch (Exception y) {
			System.out.println("General Exception");
		}
		
		System.out.println("Program completed");
	}	

}
