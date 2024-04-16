package week3;

import static input.InputUtils.*;

public class tires {
    public static String main(String[] args) {
        //
        int numberOftirestocompare = positiveIntInput("enter number of tires");
        // create a loop here
        // you can use any letter here i chose c
        for (int t = 0; t < numberOftirestocompare; t++) {
            String report = getTireInfo();
            System.out.println(report);
        }

        {
            String tireName = stringInput("Enter name of tire");
            double price = doubleInput("enter price for " + tireName
            );
            double miles = doubleInput("Enter Warranty miles for" + tireName);
            double priceperMile = price / miles;
            return ("the" + tireName + "tire cost $"
                    + priceperMile + "dollars per mile");
            // protyping is important to always have a working program
        }

    }

    private static String getTireInfo() {
        return null;
    }
}






