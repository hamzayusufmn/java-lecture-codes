package week3;

import java.util.Arrays;

public class makeArrayUppercase {
    public static void main(String[] args) {

        String[] sponsers = {"ikea", "at&t", "cvs", "3m"};
        makeArrayUppercase(sponsers);
        System.out.println(Arrays.toString(sponsers));
        // will be modifed so we can see changes
        // be aware of bugs with arrays and modifactions




    }

    public static void makeArrayUppercase(String[] array) {
        for (int g = 0; g < array.length; g++) {
            array[g] =  array[g].toUpperCase();
        }

    }
}
