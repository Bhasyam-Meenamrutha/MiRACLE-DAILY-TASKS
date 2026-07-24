package exception_handling_two;

import java.util.Scanner;

class InvalidEmpIdException extends Exception {
	InvalidEmpIdException(String msg){
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

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg){
		super(msg);
	}
}

class InvalidSalaryException extends Exception {
	InvalidSalaryException(String msg){
		super(msg);
	}
}

public class EmployeeRegistration {
	
	public static void validateAge(int age) throws InvalidAgeException{
		if(age<21 || age>60)
			throw new InvalidAgeException("Age should be between 21 to 60");
	}
	public static void validateEmpId(String emp) throws InvalidEmpIdException{
	    if (!emp.startsWith("EMP")) 
			throw new InvalidEmpIdException("Employee ID must start with EMP.");
		
	}
	public static void validatePhone(String num) throws InvalidPhoneException{
	    if (num.length() != 10 || !num.matches("\\d{10}")) 
			throw new InvalidPhoneException("Phone number should contain exactly 10 digits.");
		
	}
	
	public static void validateSalaray(double sal) throws InvalidSalaryException{
	    if (sal<15000.0) 
			throw new InvalidSalaryException("Salary should be greater than ₹15,000.");
		
	}
	public static void validEmail(String email) throws InvalidEmailException{
	    if (!email.endsWith("company.com")) 
			throw new InvalidEmailException("Email must belong to company.com.");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter EmpId: ");
			String emp=sc.next();
			validateEmpId(emp);
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			validateAge(age);
			System.out.println("Enter Email: ");
			String email=sc.next();
			validEmail(email);
			
		}catch(InvalidEmpIdException | InvalidAgeException | InvalidEmailException e) {
			System.out.println("Registration Failed! "+e.getMessage());
		}

	}

}
