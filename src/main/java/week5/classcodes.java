package week5;

import java.util.HashMap;
import java.util.Map;

public class classcodes {

    public static void main(String[] args) {
        Map< Integer, String> classCodes = new HashMap<>();
        classCodes.put(1425, "DataCom");
        classCodes.put(2568, "Web");
        classCodes.put(2417,"Andorid");
        // always include two values only class name and not code will result in error


        // this willl print out all of the class codes and names in form

        for (Integer classCode: classCodes.keySet()) {
            String classname = classCodes.get(classCode);
            System.out.println("Itec " + classCode + " " + classname);
        }
        // getting number of classes i am taking// also size of class
        System.out.println("I'm taking " + classCodes.size() + "Classes");
        int numberofClasses = classCodes.size();

        int searchCode = 2417; // list the class number you want to search

        // this code will check if the class name will print and also
        // add a else if not found
        if (classCodes.containsKey(searchCode)) {
            System.out.println("This class is found in the Hashmap. The class name is " +
                    "" + classCodes.get(searchCode));
        }else {
            System.out.println(searchCode + "Not found");

        }
        int searchcode2 = 2545; // second class
            String className = classCodes.get(searchcode2);
            if (className == null) {
                System.out.println(searchcode2 + "Not found");
            } else {
                System.out.println("This class is found in the hashmap. the class name is" + className);


            }


    }
}
