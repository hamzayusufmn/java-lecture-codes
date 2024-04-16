package week3;

import static input.InputUtils.doubleInput;

public class MPG  {
    public static void main(String[] args) {
        double miles = doubleInput("enter number of miles driven");
        double gas = doubleInput("enter gallons of gas used");
        // can written in own paramaters doesnt matter


    }
    public static double milesperGallon (double miles , double gallonsofGas) {
        double mpg = miles / gallonsofGas;
        return mpg;
        // this return the valuves also rmr to add code up there for code to work
        // u can resuse names in main and diffrents usages aswell and
        // anything used in other methods doesnt exist in main


    }
}
