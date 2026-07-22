package strings_two;

// An organization wants to analyze employee email addresses. Write a program to count how many employees use each email domain 
// (such as gmail.com, yahoo.com, company.com) from a list of email addresses.
public class OrgEmail {
    public static void main(String[] args) {
        String[] emailAddresses = { "meena@gmail.com", "pavani@yahoo.com","bob@company.com","nithin@gmail.com","priyaa@company.com" };

        int gmailCount = 0;
        int yahooCount = 0;
        int companyCount = 0;

        for (String email : emailAddresses) {
            if (email.endsWith("@gmail.com")) {
                gmailCount++;
            } else if (email.endsWith("@yahoo.com")) {
                yahooCount++;
            } else if (email.endsWith("@company.com")) {
                companyCount++;
            }
        }

        System.out.println("Gmail users: " + gmailCount);
        System.out.println("Yahoo users: " + yahooCount);
        System.out.println("Company users: " + companyCount);
    }
}
