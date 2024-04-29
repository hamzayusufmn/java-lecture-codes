package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class tirecomprasion {
    public static void main(String[] args) {
        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        } while (yesNoInput("More tires to add to compare"));

        Collections.sort(tireList);
        printReportTable(tireList);
    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter the name of your tires");
        double price = positiveDoubleInput("Enter the price of " + name + "?");
        int mileWarranty = positiveIntInput("Enter the number of miles warranty");
        return new Tire(name, price, mileWarranty);
    }
// rember to encusplate
    private static void printReportTable(List<Tire> tireList) {
        for (Tire tire : tireList) {
            System.out.println("Cost per set of 4 is $ " + tire.costForSet());
        }
    }
}