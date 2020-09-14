package java_basic_io;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class Consol_Password_check {

	public static void main (String args[]) throws IOException {

        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String login = c.readLine("Enter your login: ");
        char [] oldPassword = c.readPassword("Enter your old password: ");

        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                char [] newPassword1 = c.readPassword("Enter your new password: ");
                char [] newPassword2 = c.readPassword("Enter new password again: ");
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    c.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    c.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }

        Arrays.fill(oldPassword, ' ');
    }
    
    // Dummy change method.
    static boolean verify(String login, char[] password) {
        // This method always returns
        // true in this example.
        // Modify this method to verify
        // password according to your rules.
        return true;
    }

    // Dummy change method.
    static void change(String login, char[] password) {
        // Modify this method to change
        // password according to your rules.
    }
}
//The Password class follows these steps:
//
//Attempt to retrieve the Console object. If the object is not available, abort.
//Invoke Console.readLine to prompt for and read the user's login name.
//Invoke Console.readPassword to prompt for and read the user's existing password.
//Invoke verify to confirm that the user is authorized to change the password. (In this example, verify is a dummy method that always returns true.)
//Repeat the following steps until the user enters the same password twice:
//Invoke Console.readPassword twice to prompt for and read a new password.
//If the user entered the same password both times, invoke change to change it. (Again, change is a dummy method.)
//Overwrite both passwords with blanks.
//Overwrite the old password with blanks.