package exception_handling_two;

import java.util.Scanner;

class AccessDeniedException extends Exception{
	AccessDeniedException(String msg){
		super(msg);
	}
}

class EmployeeArrayFullException extends Exception{
	EmployeeArrayFullException(String msg){
		super(msg);
	}
}

public class EmployeeAccessSystem {
	static int count;
	static String emp[]=new String[3];	
	
	static void addEmp(String role,String name)throws  AccessDeniedException,EmployeeArrayFullException{
		if(!(role.equalsIgnoreCase("HR")  || (role.equalsIgnoreCase("MANAGER")))){
			throw new AccessDeniedException("Only HR or the Manager can add employees ");
		}
		
		
		if(count==emp.length) {
			throw new EmployeeArrayFullException("The employee array is full");
		}
		emp[count]=name;
		count++;
		System.out.println("Employee Added Successfully");
	}
	
	static void viewEmp() {
		
		if(count==0) {
			System.out.println("No employee found");
			return;
		}
		System.out.println("Employee List:");
		for(int s=0;s<count;s++) {
			System.out.println((s+1) +":"+emp[s]);
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("##### Employee Access System #####");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice:");
			
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
			try {	
				System.out.println("Enter yore role: ");
				String role=sc.next();
				System.out.println("Enter Employee name: ");
				String name=sc.next();
				addEmp(role,name);
			}catch(EmployeeArrayFullException | AccessDeniedException e) {
				System.out.println("Operations failed ! "+e.getMessage());
			}
			break;
			
			case 2:
				viewEmp();
				break;
			case 3: 
				System.out.println("ThankYou");
				System.exit(0);
			default : System.out.println("Invalied choice");
				
			
			}
		
		
		
		}

	}

}
