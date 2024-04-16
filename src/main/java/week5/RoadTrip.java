package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = Map.of(
                "Duluth", 154,
                "StillWater", 26,
                "Brainerd", 127,
                "Ely", 245,
                "Red Wing", 54);


        // the words for cities and numbers can be interchanged
        // puttinfg in other cites arent allowed when creating map.of

        System.out.println(distances);

        int maxDrivingDistance = positiveIntInput("Enter the Max distance you want to drive");

        // this will create and tell us how long and if the city meets requirments

        List<String> citiesinrange = new ArrayList<>();
        for (String city : distances.keySet()) {
            int distance = distances.get(city);
            if( distance <= maxDrivingDistance) {
                System.out.println(city + "Is" + distance + "Miles away");
                citiesinrange.add(city);
            }
            {

                if (citiesinrange.isEmpty()) {
                    System.out.println("Sorry, no Minneasota cites are within your driving distances");
                }else {
                    System.out.println("Here are cities you can drive too"+ citiesinrange.size());
                    for(String City : citiesinrange) {
                        System.out.println (City);
                        // USED uppercase C in city becuase city was defined in scope already
                    }
                }
            }

        }
    }
}
