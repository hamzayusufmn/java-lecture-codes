package week2;

import java.util.Random;

import static input.InputUtils.intInput;

public class guessthenumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = intInput("guess the number");


        while (guess != secretNumber) {
            System.out.println("That's wrong, Try Again");

            if (guess < secretNumber) {
                System.out.println("guess higher!");
            }
            guess = intInput("guess the number");

            System.out.println("Correct!");

// code that expanded on guessing the game can be adjusted
        }


        }
    }

