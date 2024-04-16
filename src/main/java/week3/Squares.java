package week3;

import static input.InputUtils.doubleInput;

public class Squares {

    // first method to be run this can be considered to be the main method

    public static void main(String[] args) {
        double number = doubleInput("please enter a number and i'll square it");
        square(number);
        // this will be the end
        // this can be imported and i found that to be wrong so creating a private one solved iy.



    }

    private static void square(double n) {
        double sq = n *  n; // the square will mulitply by itself
        System.out.println(" the square of " + n + "is" + sq);
        // this method will print out the answer
    }
}
