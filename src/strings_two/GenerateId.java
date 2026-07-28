package strings_two;
// An HR system wants to display employee initials on ID cards. Write a program to accept the employee's full name and generate initials.
// Example
// Input:Sai Krishna Reddy
// Output: S.K.R

public class GenerateId {
    public static void main(String[] args) {
        String fullName = "Bhasyam Meena Amrutha";
        String initials = generateInitials(fullName);
        System.out.println("Employee Initials: " + initials);
    }

    public static String generateInitials(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            initials.append(words[i].charAt(0));
            if (i < words.length - 1) {
                initials.append(".");
            }
        }
        return initials.toString();
    }
}
