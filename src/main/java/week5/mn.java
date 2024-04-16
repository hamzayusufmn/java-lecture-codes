package week5;

import javax.xml.parsers.SAXParser;
import java.util.HashMap;
import java.util.Map;

public class mn {
    public static void main(String[] args) {
        HashMap<String, String> STATEabbvervations = new HashMap<>();
        STATEabbvervations.put("MINN", "MN");
        STATEabbvervations.put("Wisconsin", "WI");
        STATEabbvervations.put("Albany", "NY");

        System.out.println(STATEabbvervations);

        System.out.println(STATEabbvervations.get("MINN"));
        System.out.println(STATEabbvervations.get("Iowa"));
        // this return null becasue it isnt in our hashmap
        // sometimes key isnt imporant and the values matter the most

        String wisconsinabbrevations = STATEabbvervations.get("Wisconsin");
        System.out.println(wisconsinabbrevations);

        // this will loop over hashmap keys
        for (String stateName: STATEabbvervations.keySet()) {
            System.out.println(stateName);
            System.out.println(STATEabbvervations.get(stateName));

            // while that looped over keys this will loop over values
            for ( String abbreviation : STATEabbvervations.values()) {
                System.out.println(abbreviation);
            }
            String Searchabbreviation = "MI";

            for (String StateName : STATEabbvervations.keySet()) {
                System.out.println(StateName);
                String abbreviaton = STATEabbvervations.get(stateName);
                if (abbreviaton.equals(Searchabbreviation));
                System.out.println(" Found it! the state for" + Searchabbreviation + " Is" +
                        "");

// creating a new hashmap- each key becomes a value.

                Map<String, String>  AbbrevationsStateName = new HashMap<>();

                for(Map.Entry<String, String> entry : STATEabbvervations.entrySet()) {
                    String state = entry.getKey();
                    String abbrevation = entry.getValue();
                    AbbrevationsStateName.put(abbrevation, state);
                    System.out.println(STATEabbvervations);
                    System.out.println(AbbrevationsStateName);
                    // this will help customize maps and key value pairs to any requirments needed
                }
             }

        }

    }
    //
}
