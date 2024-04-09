package week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class blooddonor {
    public static void main(String[] args) {
        // seening if two things are true
        // a person can be a blood donor if
        // they weight aleast 110lbs and are 17 or over
        System.out.println("What is your weight");
        double weight = doubleInput();

        System.out.println(" How old are you ");
        int age = intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
        } else {
            System.out.println("Sorry you aren't eligible");
            if (weight < 100) {
                System.out.println(" you do not weight enough");

            }
            if (age < 17) {
                System.out.println(" You are not old enough. you must be 17 or oldee");
            }
        }

        }
    }




