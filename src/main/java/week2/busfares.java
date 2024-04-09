package week2;

import static input.InputUtils.doubleInput;

public class busfares {
    public static void main(String[] args) {
       final  int numberofDays = 7;
        double total = 0;

        for (int day = 1; day <= numberofDays; day++) {
            double amountSpend = doubleInput(" what did you spend" +
                    "on bus fares today" + day);
            total = total + amountSpend;


        }
        System.out.printf("total for the week = $%.2f", total);

    }
}