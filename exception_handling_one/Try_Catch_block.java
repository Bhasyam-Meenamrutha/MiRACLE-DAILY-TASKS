package exception_handling_one;
import java.util.Scanner;

public class Try_Catch_block {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		try {
			System.out.println("hello");
			int x= a/b;
			System.out.println(x);
			System.out.println("hi");

			
		}catch(ArithmeticException e ){
			System.out.println(e);
		}
		System.out.println("hi");

	}

}
