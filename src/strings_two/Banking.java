package strings_two;

// A banking application requires users to create secure passwords. A valid password must contain at least 8 characters, one uppercase letter, 
// one lowercase letter, one digit, and one special character. Write a program to validate the password and display whether it is Strong or Weak.

public class Banking {
    public static void main(String[] args) {
        String pass = "Ammu@2004";
        boolean isStrong = valiPass(pass);
        System.out.println("Password is " + (isStrong ? "Strong" : "Weak"));
    }

    public static boolean valiPass(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String splChar = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (splChar.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
