package week6;

import static input.InputUtils.intInput;

public class userentersdata {
    public static void main(String[] args) {

        int userInput;
        do {
            userInput = intInput("Please enter a number 1-10");
        } while (userInput < 1 || userInput > 10);

        System.out.println("Thanks the number you entered is " + userInput);


    }
}
