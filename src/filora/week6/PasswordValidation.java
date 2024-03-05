package filora.week6;

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
    public static boolean isValidPassword(String password) {
       if (password.length() < 6 || password.contains(" ")) {
          return false;
       }

       boolean hasUpperCase = false, hasLowerCase = false, hasDigit = false, hasSpecialChar = false;

       for (char c : password.toCharArray()) {
          if (Character.isUpperCase(c)) {
             hasUpperCase = true;
          } else if (Character.isLowerCase(c)) {
             hasLowerCase = true;
          } else if (Character.isDigit(c)) {
             hasDigit = true;
          } else {
             hasSpecialChar = true;
          }
       }

       return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

   public static void main(String[] args) {
      // Test passwords
      String[] passwords = {
        "Password123!",
        "pass",
        "PASSWORD123!",
        "Pass word123!",
        "Pass123",
        "Password!"
      };

      for (String password : passwords) {
         System.out.println("Password: \"" + password + "\" is valid: " + isValidPassword(password));
      }
   }
}
