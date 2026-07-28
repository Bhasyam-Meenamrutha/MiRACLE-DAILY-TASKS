package exception_handling_two;
import java.util.*;

class InvalidAadharException extends Exception {
	InvalidAadharException(String msg){
		super(msg);
	}
}

class InvalidPanException extends Exception {
	InvalidPanException(String msg){
		super(msg);
	}
}

class InvalidDepositException extends Exception {
	InvalidDepositException(String msg){
		super(msg);
	}
}

class InvalidPhoneException extends Exception {
	InvalidPhoneException(String msg){
		super(msg);
	}
}


public class BankAccountOpeningSystem {
	
	public static void validatePhone(String num) throws InvalidPhoneException{
	    if (num.length() != 10 || !num.matches("\\d{10}")) 
			throw new InvalidPhoneException("Phone number should contain exactly 10 digits.");
		
	}
	
	public static void validateAadhar(String aadhar) throws InvalidAadharException{
		if(aadhar.length()!=12 || !aadhar.matches("\\d{12}"))
			throw new InvalidAadharException("Aadhaar must contain exactly 12 digits.");
			
	}
	
	public static void validatePan(String pan) throws InvalidPanException{
		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
			throw new InvalidPanException("Incorrect! Enter PAN Number Correctly");
	}
	
	public static void validateDeposite(double amt) throws InvalidDepositException{
		if(amt<1000)
			throw new InvalidDepositException("Initial deposit must be at least ₹1000.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Customer Name");
			String name=sc.next();
			System.out.println("Welcome "+name);
			System.out.println("Enter Aadhar Number:");
			String aadhar=sc.next();
			validateAadhar(aadhar);
			System.out.println("Enter PAN Number:");
			String pan=sc.next();
			validatePan(pan);
			System.out.println("Enter Intital Deposit Amount Number:");
			double deposite=sc.nextDouble();
			validateDeposite(deposite);
			System.out.println("Enter Mobile No: ");
			String mobile=sc.next();
			validatePhone(mobile);
			System.out.println("Thank You");
			
			
		}catch(InvalidAadharException | 
				InvalidPanException | 
				InvalidDepositException | 
				InvalidPhoneException e) {
			System.out.println("Account Creation Failed!"+e.getMessage());
			
		}

	}

}
