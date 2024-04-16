package week3;

import static input.InputUtils.intInput;

public class count {
    public static void main(String[] args) {

        // this lab will list a number in order

        int smallNumber = intInput("enter a small number");
        int largeNumber = intInput(" enter a large number");

        System.out.println("i will count from" + smallNumber + "to" + largeNumber );
        // methods down below dont retun anything
        // we can use void to make it not count learned from the lesson




    }

    public static void count (int min, int max) {
        for (int i = min; i <= max ; i++) {
            System.out.println(i);
        }

    }
}
