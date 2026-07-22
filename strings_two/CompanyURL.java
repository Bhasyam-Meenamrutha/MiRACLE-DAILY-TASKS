package strings_two;

// A company stores website URLs submitted by customers. Write a program to check whether the entered URL starts with http:// or 
// https:// and display whether it is a valid website URL.
public class CompanyURL {
    public static void main(String[] args) {
        String url = "htts://www.flipkart.com";
        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("Valid website URL.");
        } else {
            System.out.println("Invalid website URL.");
        }
    }
}
