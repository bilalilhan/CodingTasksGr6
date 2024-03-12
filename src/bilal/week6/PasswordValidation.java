package bilal.week6;

import java.util.Arrays;

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

        String givenPassword = "Gr-6==>Unique";
        boolean isValid = verifyPassword(givenPassword);
        System.out.println("The password is valid and strong---> " + isValid);


        System.out.println("---------extra--------------");
        String str = "Gr-6==>Unique";
        char[] charArray = str.toCharArray();

        System.out.println(Arrays.toString(charArray));


    }


    public static boolean verifyPassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        //we assign all boolean as default-false, such as
        //String str="";   OR int number=0;
        // Requirement 2: Password should contain at least one upper case letter
        boolean hasUpperCase = false;
        // Requirement 3: Password should contain at least one lowercase letter
        boolean hasLowerCase = false;
        // Requirement 4: Password should contain at least one special character
        boolean hasSpecialChar = false;
        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;

        for (char each : password.toCharArray()) {
            //for String.toCharArray() >>>> look  inside main method -------extra------
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(each)) {
                hasSpecialChar = true;
            }
        }

        // All requirements must be true for the password to be considered valid
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

}
