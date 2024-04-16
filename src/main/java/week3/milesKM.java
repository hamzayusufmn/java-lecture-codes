package week3;

import static input.InputUtils.doubleInput;

public class milesKM {
    public static void main(String[] args) {
        int milesKM = 0;
        double mile = doubleInput("enter a number of miles");
        double km = milesKM;
        System.out.println(mile + "miles is equal to" + km + "Kilometers");

    }

    private static double MilsKm(double mile) {


        return  mile * 1.6;
        // code is  being returned to see how much miles is  a kilometer
        // private staic can be added to public
    }
}
