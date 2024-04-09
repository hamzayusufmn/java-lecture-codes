package week1;

import static input.InputUtils.doubleInput;

public class abovefreezing {


    public static void main(String[] args) {

        System.out.println(" enter today's Temperature in F");
        double temp = doubleInput();

        if (temp > 32) {
            // only will work if condtion is true
            System.out.println(" its above freezing ");
        } else {
            System.out.println(" it's below freezing");


        }

    }
}