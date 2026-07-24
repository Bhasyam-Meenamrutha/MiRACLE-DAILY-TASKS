package exception_handling_two;
import java.util.Scanner;

class InvalidNameException extends Exception {
	public InvalidNameException(String msg){
		super(msg);
	}
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg){
		super(msg);
	}
}

class InvalidMarksException extends Exception {
	InvalidMarksException(String msg){
		super(msg);
	}
}

class InvalidEmailException extends Exception {
	InvalidEmailException(String msg){
		super(msg);
	}
}

class InvalidPhoneException extends Exception {
	InvalidPhoneException(String msg){
		super(msg);
	}
}


public class AdmissionPortal {
	
	public static void validateName(String name) throws InvalidNameException{
		if(name.trim().isEmpty()) 
			throw new InvalidNameException("Name should not be empty.");
		}
		
	public static void validateAge(int age) throws InvalidAgeException{
		if(age<17 || age>25)
			throw new InvalidAgeException("Age should be between 17 to 25");
	}
	
	public static void validateMarks(double marks) throws InvalidMarksException{
		if(marks <0 || marks>100) {
			throw new InvalidMarksException("Marks should be between 0 and 100.");
		}
	}
	
	public static void validatePhone(String num) throws InvalidPhoneException{
	    if (num.length() != 10 || !num.matches("\\d{10}")) 
			throw new InvalidPhoneException("Phone number should contain exactly 10 digits.");
		
	}
	public static void validEmail(String email) throws InvalidEmailException{
	    if (!email.contains("@")) 
			throw new InvalidEmailException("Email should contain @.");
		
	}
		
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			//System.out.println("Enter Name:");
			//String name=sc.next();
			validateName("Meena");
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			validateAge(age);
			System.out.println("Enter marks: ");
			double marks=sc.nextDouble();
			validateMarks(marks);
			System.out.println("Enter Mobile No: ");
			String mobile=sc.next();
			validatePhone(mobile);
			System.out.println("Enter Email: ");
			String email=sc.next();
			validEmail(email);
		}catch (InvalidNameException |InvalidEmailException | InvalidAgeException | InvalidPhoneException | InvalidMarksException e) {
			System.out.println("Admission failed! "+e.getMessage());
		}

	}

}
