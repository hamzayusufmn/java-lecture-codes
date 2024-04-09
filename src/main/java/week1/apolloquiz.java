package week1;

import static input.InputUtils.intInput;

public class apolloquiz {


    public static void main(String[] args) {
        System.out.println("Quiz Time!");
        System.out.println("what year did the apollo 11 spaceship land on the moon");
        // the answer is 1969

        int answer = intInput();

        // tests to see if two values are not equal
        // value tests if answer is not equal to 1969.

        if (answer != 1969 ) {
            System.out.println(" Wrong Answer - it was 1969");
        }

    }
}

