package week2;

import static input.InputUtils.stringInput;

public class password {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        System.out.println();
        String userPassword = stringInput("Enter the password");
        int maxGuesses = 5;
        //always use the .equals() to check if they have same characters
        // before user enters we need to verify password
        // this loop will repeat while the password

        while ( ! userPassword.equals(secretPassword) && maxGuesses > 1) {
            System.out.println(" Password incorrect, access denied");
            // display this message if user gets password incorrect
            System.out.println("Try again");
            // ask user to try again
            userPassword = stringInput("Enter the passcode");
            maxGuesses--;
        }
        if (maxGuesses > 1 ) {
            System.out.println(" Correct password - acsess granted");

            // if user get it wrong the process will start again

        }
        else {
            System.out.println(" max number of password attempts.");
            System.exit(0);
        }
    }
}
