package week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class snow {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("march", 4.1);
        snowfall.put("april", 0.0);
        // always put 0.0 so data can show
        // this tells the user the month and how much snowfall
        System.out.println(snowfall);

        for(String month: snowfall.keySet()) {
        double snow = snowfall.get(month);
        snowfall.put("February", 12.4);
            System.out.printf("the snow in %s was %.2f inches\n ", month, snow );

        System.out.println(snowfall);
        System.out.println(" the snow in Janaury is " + snowfall.get("January") + "inches");
        System.out.println("the snow in july is" + snowfall.get("July" + "Inches"));
        // can there be ways to type this in without having to manuly put the month in
        // this will tell us how much snow we get

        if (snowfall.containsKey("July")) {

        System.out.println("There was snow in july.");
    } else {
            System.out.println("there was no snow in july");
            // this method shows a method that implies if there is snow else printing out there is
            // no snow
        }
        String newMonth = stringInput("enter name of month");
        double newSnow = positiveDoubleInput("enter amount of snow for " + newMonth);
        snowfall.put(newMonth,newSnow);
            System.out.println(snowfall);
            if (snowfall.containsKey(newMonth))
            {
                System.out.println(" this hashmap already contains that month " + newMonth
                + "snow = " + snow + "inches");
                boolean overwrite = yesNoInput("overwrite data");

            } else {
                snowfall.put(newMonth, newSnow);
            }
            }

    }
}
