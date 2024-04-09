package week1;

import static input.InputUtils.stringInput;

public class deparmentcode {


    public static void main(String[] args) {
        String deparmentCode = stringInput("Enter department code");
        // always check for valid code
        if (deparmentCode.length() == 4) {
            System.out.println("The code is valid.");
            deparmentCode = deparmentCode.toUpperCase();
            System.out.println("The code is " + deparmentCode);
        } else {
            System.out.println("The Code is not valid");
        }
    }







}