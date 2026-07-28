package exception_handling_one;

public class ThrowEx {

	public static void main(String[] args) {
		int age=10;
		
		try {
			if(age<18) {
				throw new ArithmeticException("you are not eligible to vote");
			}
			System.out.println("You are eligible to vote.");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		
		System.out.println("hi....");

	}

}
