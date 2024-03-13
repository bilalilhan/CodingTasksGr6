package ameneh.week6;
import java.util.regex.Pattern;
public class PasswordValidation {

    /*String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static void main(String[] args) {
        // Example usage
        String password1 = "Pass@369";
        String password2 = "WeakPassword";

        System.out.println("Password 1 is valid: " + isValidPassword(password1));
        System.out.println("Password 2 is valid: " + isValidPassword(password2));
    }
    /*The main method demonstrates the usage of the isValidPassword method by checking two example passwords (password1 and password2) and printing whether each password is valid or not.*/

    public static boolean isValidPassword(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        /*
        Checks if the length of the password is less than 6 characters or if it contains a space. If either condition is true, it returns false, indicating that the password is not valid.
        */

        } else if (!password.matches(".*[A-Z].*")) {
            return false;
        /*
        If the previous condition is false, it checks if the password contains at least one uppercase letter. If not, it returns false.
        */

        } else if (!password.matches(".*[a-z].*")) {
            return false;
        /*
        If the previous condition is false, it checks if the password contains at least one lowercase letter. If not, it returns false.
        */

        } else if (!password.matches(".*[!@#$%^&*()-_+=].*")) {
            return false;
        /*
        If the previous conditions are false, it checks if the password contains at least one special character. If not, it returns false.
        */

        } else if (!password.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }
    /*
    If the previous conditions are false, it checks if the password contains at least one digit. If not, it returns false.If all the conditions are false, it means the password meets all the requirements, and the method returns true.
    */

}
