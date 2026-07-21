package strings_two;

// A university issues roll numbers in the format CSE2026XXXX, where CSE is the department code, 2026 is the 
// admission year, and XXXX is a four-digit unique number. Develop a program to validate whether the entered
// roll number follows the required format and display an appropriate message.

public class Univercity {
    public static void main(String[] args) {
        String rollNumber = "CSE20260801";

        if (rollNumber.matches("CSE2026\\d{4}")) {
            System.out.println("Valid roll number: " + rollNumber);
        } else {
            System.out.println("Invalid roll number: " + rollNumber);
        }
    }
}
