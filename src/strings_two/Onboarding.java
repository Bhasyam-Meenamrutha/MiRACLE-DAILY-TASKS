package strings_two;

// A company is onboarding new employees and wants to automatically generate official email
// addresses. The system should accept the employee's full name and department, remove extra
// spaces, convert all characters to lowercase, replace spaces with dots (.), and append the
// company domain (for example, @miraclesoft.com). Display the generated email address.

public class Onboarding {
    public static void main(String[] args) {
        String fullName = "  Meenamrutha Bhasyam  ";
        String department = "  Development  ";

        String clearName = fullName.trim().toLowerCase();
        String clearDepartment = department.trim().toLowerCase();

        String emailName = clearName.replace(" ", ".");
        String emailDepartment = clearDepartment.replace(" ", ".");

        String companyDomain = "@miraclesoft.com";
        String generatedEmail = emailName + "." + emailDepartment + companyDomain;

        System.out.println("Generated Email Id: " + generatedEmail);
    }
    
}
