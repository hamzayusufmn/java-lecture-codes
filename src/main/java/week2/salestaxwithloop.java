package week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class salestaxwithloop {
    public static void main(String[] args) {
        boolean moreCalcutations = true;
        double price;
        double salesTax = 1.07;
        // this  loops repeats as long as user wants to do more calculations
        while (moreCalcutations) {
            price = doubleInput("type in a price");
            double priceInclTax = price * salesTax;
            System.out.println(" the price plus sale tax is " + priceInclTax);
            moreCalcutations = yesNoInput("do you want to continue");
            System.out.println("Thanks for using the program - goodbye!");
        }
    }
}
