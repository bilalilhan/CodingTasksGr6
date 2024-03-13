package muhammad.week6;

public class PasswordValidation {
    /*String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidPassword("Passw0rd!")); // true
        System.out.println(isValidPassword("Weak")); // false
    }

    // Method to verify if a password is valid
    public static boolean isValidPassword(String password) {
        // Check if password is null or its length is less than 6
        if (password == null || password.length() < 6) {
            return false;
        }

        // Check if password contains space
        if (password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }
}

