package strings_two;

// A social media platform stores a list of existing usernames. When a new user enters a username, the system should ignore letter case while
//  checking whether the username already exists. Display whether the username is available or already taken.

public class SocialMedia {
    public static void main(String[] args) {
        String[] existingUsers = {"Meenamrutha", "Pavani", "Nithin", "Priya"};
        String newUser = "nithin";

        boolean isAvailable = true;
        for (String username : existingUsers) {
            if (username.equalsIgnoreCase(newUser)) {
                isAvailable = false;
                break;
            }
        }

        if (isAvailable) {
            System.out.println("The username " + newUser + " is available.");
        } else {
            System.out.println("The username '" + newUser + "' is already taken.");
        }
    }
    
}
